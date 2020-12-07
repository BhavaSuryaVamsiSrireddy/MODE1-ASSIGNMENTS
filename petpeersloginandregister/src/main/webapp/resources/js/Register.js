function validate() {
	var result;
	var password = document.forms["regform"]["password"].value;
	var repeatPassword = document.forms["regform"]["repeatPassword"].value;
	if (password.match(/[a-z]/g) && password.match(/[A-Z]/g)
			&& password.match(/[0-9]/g) && password.match(/[^a-zA-Z\d]/g)
			&& password.length >= 8) {
		if( password == repeatPassword){
			result = true;
		}
		window.alert("Password and repeatPassword should be same");
		result = false;
	}
	else{
		window.alert("Please enter a password with One Capital letter, One LowerCase letter, One Special Character and One Digit and also length should be minimum 8");
		return false;
	}
	return result;
}