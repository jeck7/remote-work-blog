package mobilskys.blog.api;

import mobilskys.blog.model.domain.User;
import mobilskys.blog.model.dto.UserDto;
import mobilskys.blog.repository.UserRepository;
import mobilskys.blog.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;

public class UserControllerTest {
    @Mock
    Logger logger;
    @Mock
    UserService userService;
    @Mock
    UserRepository userRepository;
    @Mock
    ModelMapper modelMapper;
    @InjectMocks
    UserController userController;

    @Mock
    UserDto userDto;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRegisterAccount() throws Exception {
        when(userService.registerAccount(any())).thenReturn(new User(Long.valueOf(1), "userName"));

        ResponseEntity result = userController.registerAccountNew(userDto);
        Assert.assertEquals(null, result);
    }

    @Test
    public void testGetUser() throws Exception {

        when(userRepository.findByEmail(anyString())).thenReturn(null);

        ResponseEntity<UserDto.Response> result = userController.getUser("email");
        Assert.assertEquals(null, result);
    }
}

