package de.fhdortmund.service.authentication.authenticationmanager;

import de.fhdortmund.service.authentication.entities.User;
import de.fhdortmund.service.authentication.service.UserService;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;


@Component
public class BasicAuthenticationManager implements AuthenticationManager {

  static Logger logger = Logger.getLogger(BasicAuthenticationManager.class.getName());

  private UserService userService;

  @Autowired
  public BasicAuthenticationManager(UserService userService) {
    this.userService = userService;
  }

  /**
   * This methode handles the authentication
   *
   * @param authentication Contains Username and Password.
   * @return Userpasswordtoken Generated token.
   * @throws AuthenticationException this should not happen.
   */
  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    String username = authentication.getName().toString();
    String password = authentication.getCredentials().toString();

    User user = userService.findByUsername(username);

    if (user == null) {
      return null;
    }

    if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
      logger.info("User getting logged in.");
      return new UsernamePasswordAuthenticationToken(username, password, new ArrayList<>());
    }
    return null;
  }
}
