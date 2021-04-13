package david.angulo.onion.modules.loginTest

import david.angulo.onion.modules.login.LoginViewModel
import org.junit.Test
import org.mockito.Mockito


class LoginViewModelTest {
    val vievModel = Mockito.mock(LoginViewModel::class.java)



    @Test
    fun valid() {
       vievModel.validatePassword("")
    }
}