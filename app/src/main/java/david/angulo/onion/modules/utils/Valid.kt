object Valid {
    var emailRegex =  Regex(pattern = "[-0-9a-zA-ZñÑçÇ.+_]+@[-0-9a-zA-Z.+_]+\\.[a-zA-Z]{2,5}")
    var usernameRegex =  Regex(pattern = "^[a-zA-Z0-9ñÑçÇ]*\$")
    var passwordRegex = Regex(pattern ="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@\$!%*?&]{8,}\$")

    fun isUsernameValid(string: String): Boolean {
        return string.matches(usernameRegex) && string.isNotEmpty()
    }

    fun isEmailValid(string: String): Boolean {
        return string.matches(emailRegex)
    }

    fun isPasswordValid(string: String): Boolean {
        return string.matches(passwordRegex)
    }

    fun isPasswordValid(password: String, confirmPassword: String): Boolean {
        return (isPasswordValid(password)
                && isPasswordValid(confirmPassword)
                && confirmPassword == password)
    }
}