package initiative.hilla.reactive.microstream.data.endpoint;

import initiative.hilla.reactive.microstream.data.entity.User;
import initiative.hilla.reactive.microstream.security.AuthenticatedUser;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import java.util.Optional;

@Endpoint
@AnonymousAllowed
public class UserEndpoint {

    private final AuthenticatedUser authenticatedUser;

    public UserEndpoint(AuthenticatedUser authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
    }

    public Optional<User> getAuthenticatedUser() {
        return authenticatedUser.get();
    }
}
