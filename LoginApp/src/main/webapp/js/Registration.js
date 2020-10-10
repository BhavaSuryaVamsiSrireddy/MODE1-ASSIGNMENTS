function validate() {
	var result;
	var password = document.forms["regform"]["password"].value;
	var age = document.forms["regform"]["age"].value;
	if (password.match(/[a-z]/g) && password.match(/[A-Z]/g)
			&& password.match(/[0-9]/g) && password.match(/[^a-zA-Z\d]/g)
			&& password.length >= 8) {
		result = true;
	}
	else{
		window.alert("Please enter a password with One Capital letter, One LowerCase letter, One Special Character and One Digit and also length should be minimum 8");
		return false;
	}
	if (age >= 18) {
		result = true;
	}
	else{
		window.alert("Age should be 18 and above");
		return false;
	}
	return result;
}