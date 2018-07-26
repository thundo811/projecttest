	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Gentelella Alela! |</title>

<!-- Bootstrap -->
<link href="${pageContext.request.contextPath}/resources/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="${pageContext.request.contextPath}/resources/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="${pageContext.request.contextPath}/resources/vendors/nprogress/nprogress.css" rel="stylesheet">

<!-- Custom styling plus plugins -->
<link href="${pageContext.request.contextPath}/resources/build/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">
			


						<!-- sidebar menu -->
				<jsp:include page="../DashBoard/_Menu.jsp"></jsp:include>
	
				<!-- /sidebar menu -->


					<!-- page content -->
					<div class="right_col" role="main">
						<div class="">
							<div class="page-title">
								<div class="title_left">
									<h3>
										Invoice <small>Some examples to get you started</small>
									</h3>
								</div>

								<div class="title_right">
									<div
										class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
										<div class="input-group">
											<input type="text" class="form-control"
												placeholder="Search for..."> <span
												class="input-group-btn">
												<button class="btn btn-default" type="button">Go!</button>
											</span>
										</div>
									</div>
								</div>
							</div>

							<div class="clearfix"></div>

							<div class="row">
								<div class="col-md-12">
									<div class="x_panel">
										<div class="x_title">
											<h2>
												Invoice Design <small>Sample user invoice design</small>
											</h2>
	
											<ul class="nav navbar-right panel_toolbox">
												<li><a class="collapse-link"><i
														class="fa fa-chevron-up"></i></a></li>
												<li class="dropdown"><a href="#"
													class="dropdown-toggle" data-toggle="dropdown"
													role="button" aria-expanded="false"><i
														class="fa fa-wrench"></i></a>
													<ul class="dropdown-menu" role="menu">
														<li><a href="#">Settings 1</a></li>
														<li><a href="#">Settings 2</a></li>
													</ul></li>
												<li><a class="close-link"><i class="fa fa-close"></i></a>
												</li>
											</ul>
											<div class="clearfix"></div>
										</div>
										<div class="x_content">

											<section class="content invoice">
												<!-- title row -->
												<div class="row">
													<div class="col-xs-12 invoice-header">
														<h1>
															<i class="fa fa-globe"></i> Invoice. <small
																class="pull-right">Date: 16/08/2016</small>
														</h1>
													</div>
													<!-- /.col -->
												</div>
												<!-- info row -->
												<div class="row invoice-info">
													<div class="col-sm-4 invoice-col">
														From
														<address>
															<strong>Iron Admin, Inc.</strong> <br>795 Freedom
															Ave, Suite 600 <br>New York, CA 94107 <br>Phone:
															1 (804) 123-9876 <br>Email: ironadmin.com
														</address>
													</div>
													<!-- /.col -->
													<div class="col-sm-4 invoice-col">
														To
														<address>
															<strong>John Doe</strong> <br>795 Freedom Ave, Suite
															600 <br>New York, CA 94107 <br>Phone: 1 (804)
															123-9876 <br>Email: jon@ironadmin.com
														</address>
													</div>
													<!-- /.col -->
													<div class="col-sm-4 invoice-col">
														<b>Invoice #007612</b> <br> <br> <b>Order
															ID:</b> 4F3S8J <br> <b>Payment Due:</b> 2/22/2014 <br>
														<b>Account:</b> 968-34567
													</div>
													<!-- /.col -->
												</div>
												<!-- /.row -->

												<!-- Table row -->
												<div class="row">
													<div class="col-xs-12 table">
														<table class="table table-striped">
															<thead>
																<tr>
																	<th>Qty</th>
																	<th>Product</th>
																	<th>Serial #</th>
																	<th>Serial #</th>
																	<th >Description</th>
																	<th>Subtotal</th>
																</tr>
															</thead>
															<tbody>
																<c:forEach var="invoice" items="${invoicelist}">
															<tr>
																<td>${invoice.services_inv.nameService }</td>
																<td>${invoice.contractNumber}</td>
																<td>${invoice.date}</td>
																<td>${invoice.nameCompany}</td>
																<td>${invoice.indexConsumed}</td>
																<td>${invoice.grandTotal}</td>
																<td><a
																	href="${pageContext.request.contextPath}/dashboard/invoices/formInvoices/update/${invoice.idinvoice}"
																	class="btn btn-info btn-xs"><i class="fa fa-pencil"></i>Update</a></td>
																<td><a
																	href="${pageContext.request.contextPath}/dashboard/invoices/formInvoices/delete/${invoice.idinvoice}"
																	class="btn btn-danger btn-xs"><i
																		class="fa fa-trash-o"></i>Delete</a></td>			
															</tr>
														</c:forEach>
															</tbody>
														</table>
													</div>
													<!-- /.col -->
												</div>
												<!-- /.row -->

												<div class="row">
													<!-- accepted payments column -->
													<div class="col-xs-6">
														<p class="lead">Payment Methods:</p>
														<img src="images/visa.png" alt="Visa"> <img
															src="images/mastercard.png" alt="Mastercard"> <img
															src="images/american-express.png" alt="American Express">
														<img src="images/paypal.png" alt="Paypal">
														<p class="text-muted well well-sm no-shadow"
															style="margin-top: 10px;">Etsy doostang zoodles
															disqus groupon greplin oooj voxy zoodles, weebly ning
															heekya handango imeem plugg dopplr jibjab, movity jajah
															plickers sifteo edmodo ifttt zimbra.</p>
													</div>
													<!-- /.col -->
													<div class="col-xs-6">
														<p class="lead">Amount Due 2/22/2014</p>
														<div class="table-responsive">
															<table class="table">
																<tbody>
																	<tr>
																		<th style="width: 50%">Subtotal:</th>
																		<td>$250.30</td>
																	</tr>
																	<tr>
																		<th>Tax (9.3%)</th>
																		<td>$10.34</td>
																	</tr>
																	<tr>
																		<th>Shipping:</th>
																		<td>$5.80</td>
																	</tr>
																	<tr>
																		<th>Total:</th>
																		<td>$265.24</td>
																	</tr>
																</tbody>
															</table>
														</div>
													</div>
													<!-- /.col -->
												</div>
												<!-- /.row -->

												<!-- this row will not appear when printing -->
												<div class="row no-print">
													<div class="col-xs-12">
														<button class="btn btn-default" onclick="window.print();">
															<i class="fa fa-print"></i> Print
														</button>
														<button class="btn btn-success pull-right">
															<i class="fa fa-credit-card"></i> Submit Payment
														</button>
														<button class="btn btn-primary pull-right"
															style="margin-right: 5px;">
															<i class="fa fa-download"></i> Generate PDF
														</button>
													</div>
												</div>
											</section>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- /page content -->

					<!-- footer content -->
					<footer>
						<div class="pull-right">
							Gentelella - Bootstrap Admin Template by <a
								href="https://colorlib.com">Colorlib</a>
						</div>
						<div class="clearfix"></div>
					</footer>
					<!-- /footer content -->
				</div>
			</div>

			<!-- jQuery -->
			<script src="${pageContext.request.contextPath}/resources/vendors/jquery/dist/jquery.min.js"></script>
			<!-- Bootstrap -->
			<script src="${pageContext.request.contextPath}/resources/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
			<!-- FastClick -->
			<script src="${pageContext.request.contextPath}/resources/vendors/fastclick/lib/fastclick.js"></script>
			<!-- NProgress -->
			<script src="${pageContext.request.contextPath}/resources/vendors/nprogress/nprogress.js"></script>

			<!-- Custom Theme Scripts -->
			<script src="${pageContext.request.contextPath}/resources/build/js/custom.min.js"></script>
</body>
</html>