function validate() {
	var result;
	var userName = document.getElementById("userName");
	var password = document.getElementById("password");
	if (password.match(/[a-z]/g) && password.match(/[A-Z]/g)
			&& password.match(/[0-9]/g) && password.match(/[^a-zA-Z\d]/g)) {
		result = true;
	}
	else{
		window.alert("Please enter the valid credentials");
		return false;
	}
	if (userName.length != 0 && password.length >= 8) {
		result = true;
	}
	else{
		window.alert("username or password should not be empty");
		return false;
	}
	return result;
}