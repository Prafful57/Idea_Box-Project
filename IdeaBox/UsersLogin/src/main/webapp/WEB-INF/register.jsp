
<div>
	<form action="/set-user" method="post">

		<div>
			UserName : <input type="text" name="userName" value="">
		</div>
		<div>
			Password : <input type="text" name="password1" value="">
		</div>
		<div>
			ReType Password : <input type="text" name="password2" value="">
		</div>
		<br>
		<div>
			<input type="submit" value="Register">
		</div>


	</form>
</div>
<script type="text/javascript">
function goToRegister(){
	window.location.herf="/register";
}
</script> 