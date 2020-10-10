function validate() {
		var password = document.forms["loginform"]["password"].value;
		if (password.length < 8) {
			window.alert("password length should be greater than 8");
			return false;
		}
		return true;
}