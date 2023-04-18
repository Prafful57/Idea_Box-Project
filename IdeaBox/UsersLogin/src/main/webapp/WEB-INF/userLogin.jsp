
<div>
	<form action="/login" method="post">
	
	
	<div><h3>${error}</h3></div>
	
	<div><h3>${registerSuccess}</h3></div>

	<div><h3>${registrationError}</h3></div>

		<div>
			UserName : <input type="text" name="userName" value="">
		</div>
		<div>
			Password : <input type="text" name="password" value="">
		</div>
		<div>
			<input type="submit" value="login">
		</div>
		<br>
		<div>
			<input type="button" value="Register" onclick="goToRegister()">
		</div>


	</form>
</div>
<script type="text/javascript">
	function goToRegister() {
		window.location.href = "/register";
	}
</script>

