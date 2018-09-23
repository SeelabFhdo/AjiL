package de.fhdortmund.service.authentication.configuration;

import de.fhdortmund.service.authentication.authenticationmanager.BasicAuthenticationManager;
import java.security.KeyPair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationConfig extends AuthorizationServerConfigurerAdapter {

  @SuppressWarnings("SpringJavaAutowiringInspection")
  @Autowired
  private BasicAuthenticationManager basicAuthenticationManager;

  /**
   * This Bean creates the JSON Web Token and loads the Cert.
   *
   * @return a JSON Web Token cenverter
   */
  @Bean
  public JwtAccessTokenConverter jwtAccessTokenConverter() {
    JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
    KeyPair keyPair = new KeyStoreKeyFactory(
        new PathResource("/Users/phil/Dropbox/Dev/AjiML/Cert/keystore.jks"),
        "password".toCharArray()).getKeyPair("selfsigned");
    converter.setKeyPair(keyPair);
    return converter;
  }

  @Override
  public void configure(ClientDetailsServiceConfigurer clientDetailsServiceConfigurer)
      throws Exception {
    clientDetailsServiceConfigurer.inMemory()
        .withClient("client")
        .secret("password")
        .authorizedGrantTypes("authorization_code", "refresh_token",
            "password").scopes("read");
  }

  @Override
  public void configure(AuthorizationServerEndpointsConfigurer
      authorizationServerEndpointsConfigurer)
      throws Exception {
    authorizationServerEndpointsConfigurer.authenticationManager(basicAuthenticationManager)
        .accessTokenConverter(
            jwtAccessTokenConverter());
  }

  @Override
  public void configure(AuthorizationServerSecurityConfigurer authorizationServerSecurityConfigurer)
      throws Exception {
    authorizationServerSecurityConfigurer.tokenKeyAccess("permitAll()").checkTokenAccess(
        "isAuthenticated()");
  }
}
