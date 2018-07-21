<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Day 001 Login Form</title>


<link rel='stylesheet prefetch'
	href='https://fonts.googleapis.com/css?family=Open+Sans:600'>


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">


</head>

<body>
	<video muted="" autoplay="" loop="" id="hero-carousel__video">
	<source
		src="https://cdnapisec.kaltura.com/p/2258541/sp/0/playManifest/entryId/1_sfgl57lk/format/url/protocol/https/flavorParamId/487081/video.mp4"
		type="video/mp4"></video>
	<div class="login-wrap">
		<div class="login-html">
			<input id="tab-1" type="radio" name="tab" class="sign-in" ><label
				for="tab-1" class="tab">Sign In</label> <input id="tab-2"
				type="radio" name="tab" class="sign-up" checked><label for="tab-2"
				class="tab">Sign Up</label>
			<div class="login-form">
				<div class="sign-in-htm">
					<form:form action="${pageContext.request.contextPath}/login" modelAttribute="user" method="POST">

						<div class="group">
							<label for="user" class="label">Username</label>
							<form:input id="user" path="nameCustomer" type="text"
								class="input" />
						</div>
						<div class="group">
							<label for="pass" class="label">Password</label>
							<form:input id="pass" path="passCustomer" type="password"
								class="input" data-type="password" />
						</div>
						<div class="group">
							<input id="check" type="checkbox" class="check" checked>
							<label for="check"><span class="icon"></span> Keep me
								Signed in</label>
						</div>
						<div class="group">
							<input type="submit" class="button" value="Sign In">
						</div>
						<div class="hr"></div>
						<div class="foot-lnk">
							<a href="#forgot">Forgot Password?</a>
						</div>

					</form:form>

				</div>
				<div class="sign-up-htm">
					<form:form action="${pageContext.request.contextPath}/signup"
						modelAttribute="user" method="POST">
						<div class="group">
							<label for="user" class="label">Username</label>
							<form:input id="user" path="nameCustomer" type="text"
								class="input" />

							<div class="has-error">
								<form:errors path="nameCustomer" class="help-inline" />
							</div>
						</div>
						<div class="group">
							<label for="pass" class="label">Password</label>
							<form:input id="pass" path="passCustomer" type="password"
								class="input" data-type="password" />
							<div class="has-error">
								<form:errors path="passCustomer" class="help-inline" />
							</div>
						</div>
						<div class="group">
							<label for="pass" class="label">Repeat Password</label> <input
								id="pass" type="password" class="input" data-type="password">
						</div>
						<div class="group">
							<label for="pass" class="label">Email Address</label>
							<form:input path="email" id="pass" type="text" class="input" />

							<div class="has-error">
								<form:errors path="email" class="help-inline" />
							</div>

						</div>
						<div class="group">
							<input type="submit" name="button" class="button" value="Sign Up">
						</div>
						<div class="hr"></div>
						<div class="foot-lnk">
							<label for="tab-1">Already Member?</a>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>



</body>

</html>
