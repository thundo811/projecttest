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
	
	<title>Manager Bill</title>
	
	<!-- Bootstrap -->
	<link
		href="${pageContext.request.contextPath}/resources/vendors/bootstrap/dist/css/bootstrap.min.css"
		rel="stylesheet">
	<!-- Font Awesome -->
	<link
		href="${pageContext.request.contextPath}/resources/vendors/font-awesome/css/font-awesome.min.css"
		rel="stylesheet">
	<!-- NProgress -->
	<link
		href="${pageContext.request.contextPath}/resources/vendors/nprogress/nprogress.css"
		rel="stylesheet">
	<!-- iCheck -->
	<link
		href="${pageContext.request.contextPath}/resources/vendors/iCheck/skins/flat/green.css"
		rel="stylesheet">
	<!-- Datatables -->
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link
		href="${pageContext.request.contextPath}/resources/vendors/datatables.net-bs/css/dataTables.bootstrap.min.css"
		rel="stylesheet">
	<link
		href="${pageContext.request.contextPath}/resources/vendors/datatables.net-buttons-bs/css/buttons.bootstrap.min.css"
		rel="stylesheet">
	<link
		href="${pageContext.request.contextPath}/resources/vendors/datatables.net-fixedheader-bs/css/fixedHeader.bootstrap.min.css"
		rel="stylesheet">
	<link
		href="${pageContext.request.contextPath}/resources/vendors/datatables.net-responsive-bs/css/responsive.bootstrap.min.css"
		rel="stylesheet">
	<link
		href="${pageContext.request.contextPath}/resources/vendors/datatables.net-scroller-bs/css/scroller.bootstrap.min.css"
		rel="stylesheet">
	<link rel="shortcut icon"
		href="${pageContext.request.contextPath}/resources/selectServices/favicon.ico">
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/selectServices/css/style.css" />
	<link href='http://fonts.googleapis.com/css?family=Lato:300,400,700'
		rel='stylesheet' type='text/css' />
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/selectServices/js/modernizr.custom.79639.js"></script>
	<noscript>
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/resources/selectServices/css/noJS.css" />
	</noscript>
	<!-- Custom Theme Style -->
	<link
		href="${pageContext.request.contextPath}/resources/build/css/custom.min.css"
		rel="stylesheet">
	
	
	<link rel="stylesheet" type="text/css" media="screen"
		href="http://tarruda.github.com/bootstrap-datetimepicker/assets/css/bootstrap-datetimepicker.min.css">
	
	
	
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
						<div class="clearfix"></div>
	
						<div class="row">
							<div class="col-md-12 col-sm-12 col-xs-12">
								<div class="x_panel">
									<div class="x_title">
										<h2>TBALE INVOICES</h2>
										<ul class="nav navbar-right panel_toolbox">
											<li><a class="collapse-link"><i
													class="fa fa-chevron-up"></i></a></li>
											<li class="dropdown"><a href="#" class="dropdown-toggle"
												data-toggle="dropdown" role="button" aria-expanded="false"><i
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
	
	
	
	
	
									<div class="col-md-12 col-sm-12 col-xs-12">
										<div class="x_panel">
											<div class="x_title">
												<h2>Invoices Of Customer :
													${pageContext.request.userPrincipal.name}</h2>
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
												<h2>Part Select</h2>
												<div class="form-group">
													<label for="sel1">Select list (select one):</label> <select
														class="form-control" id="sel1">
														<c:forEach var="m" items="${servicelist}">
															<option
																value="${pageContext.request.contextPath}/dashboard/invoices/formInvoices/${m.nameService}">
																${m.nameService}</option>
														</c:forEach>
	
													</select> <br>
	
												</div>
	
	
												<!-- see the button attributes changes  -->
												<div id="myModal" class="modal fade" role="dialog">
													<!-- sidebar form Invoice -->
													<div class="modal-dialog">
														<!-- Modal content-->
														<div class="modal-content" style="width: 150%">
															<div class="modal-header">
																<button type="button" class="close" data-dismiss="modal">&times;</button>
															</div>
	
	
	
	
															<div class="modal-body" style="padding: 40px 50px;">
																<div class="row">
																	<div class="col-md-12 col-sm-12 col-xs-12">
																		<div class="x_panel">
																			<div class="x_content">
																				<p
																					style="text-transform: uppercase; font-size: 20px; text-align: center">
																					bill ${oneService.nameService} <span class="section">Invoice
																						Info</span>
																				</p>
																				<form:form
																					action="${pageContext.request.contextPath}/dashboard/invoices/formInvoices/add"
																					modelAttribute="invoice" method="POST"
																					class="form-horizontal form-label-left">
	
																					<c:if test="${ktUpdateId}">
																						<form:input id="hidden" path="idinvoice" />
	
																					</c:if>
																					<!-- Done -->
						 ${invoice.date}
	                      <div class="item form-group">
																						<label
																							class="control-label col-md-3 col-sm-3 col-xs-12"
																							for="name">Contract Number <span
																							class="required">*</span>
																						</label>
																						<div class="col-md-6 col-sm-6 col-xs-12">
																							<form:input id="name" path="contractNumber"
																								class="form-control col-md-7 col-xs-12"
																								data-validate-length-range="5,20" name="name"
																								placeholder="both name(s) e.g Jon Doe"
																								required="required" type="text" />
																						</div>
																					</div>
	
																					<div class="item form-group">
																						<label
																							class="control-label col-md-3 col-sm-3 col-xs-12"
																							for="occupation">Date <span
																							class="required">*</span>
																						</label>
																						<div id="datetimepicker"
																							class="col-md-6 col-sm-6 col-xs-12">
	
																							<form:input path="date" id="occupation"
																								type="text" name="occupation"
																								data-validate-length-range="5,20"
																								class="optional form-control col-md-7 col-xs-12" />
	
																							<span class="add-on"> <i
																								data-time-icon="icon-time"
																								data-date-icon="icon-calendar"></i>
																							</span>
	
																						</div>
																					</div>
	
																					<!-- Done -->
																					<div class="item form-group">
																						<label
																							class="control-label col-md-3 col-sm-3 col-xs-12"
																							for="number">Name Company<span
																							class="required">*</span>
																						</label>
																						<div class="col-md-6 col-sm-6 col-xs-12">
																							<form:select path="nameCompany"
																								cssClass="form-control"
																								items="${oneService.companys}"
																								itemValue="nameCpn" itemLabel="nameCpn" />
																						</div>
																					</div>
	
																					<!-- Done -->
																					<div class="item form-group">
																						<label
																							class="control-label col-md-3 col-sm-3 col-xs-12"
																							for="number">Index Consumed<span
																							class="required">*</span>
																						</label>
																						<div class="col-md-6 col-sm-6 col-xs-12">
																							<form:input path="indexConsumed" type="number"
																								id="number" name="number" required="required"
																								data-validate-minmax="10,100"
																								class="form-control col-md-7 col-xs-12" />
																						</div>
																					</div>
																					<div class="item form-group">
																						<label style="color: red"
																							class="control-label col-md-3 col-sm-3 col-xs-12"
																							for="number">Unit Services<span
																							class="required"></span>
																						</label> <label
																							class="control-label col-md-3 col-sm-3 col-xs-12"
																							for="number"> ${oneService.unitServices}</label>
																					</div>
																					<div class="item form-group">
																						<label style="color: red"
																							class="control-label col-md-3 col-sm-3 col-xs-12"
																							for="number">Vat<span class="required"></span>
																						</label> <label
																							class="control-label col-md-3 col-sm-3 col-xs-12"
																							for="number"> ${oneService.vatServices}</label>
																					</div>
																					<form:input path="grandTotal" type="hidden"
																						value=" ${oneService.vatServices+oneService.unitServices}" />
																					<%--                    <form:input path="customer_inv." type="hidden" value="${pageContext.request.userPrincipal.name}" /> --%>
																					<form:input path="services_inv.idservice"
																						type="hidden" value="${oneService.idservice}" />
																					<div class="ln_solid"></div>
																					<div class="form-group" align="right">
																						<div class="col-md-6 col-md-offset-3">
																							<button id="send" type="submit"
																								class="btn btn-success">Submit</button>
																						</div>
																					</div>
																				</form:form>
																			</div>
																		</div>
																	</div>
																</div>
															</div>
														</div>
													</div>
	
													<!-- /sidebar form Invoice -->
												</div>
												<script>
													$(document)
															.ready(
														
																						function() {
																						
																							  if(${kt}){
																					    	      $("#myModal").modal('show');}
																							
																	
																	});
												</script>
											</div>
										</div>
									</div>
									<!-- Part Table -->
									<div style="z-index: 10;" class="col-md-12 col-sm-12 col-xs-12">
										<div class="x_panel">
											<div class="x_content">
												<table id="datatable-responsive"
													class="table table-striped table-bordered dt-responsive nowrap"
													cellspacing="0" width="100%">
													<thead>
														<tr>
															<th>Service</th>
															<th>Number</th>
															<th>Date</th>
															<th>Company</th>
															<th>Consumed</th>
															<th>Grand Total</th>
															<th>Update</th>
															<th>Delete</th>
													
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
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- /page content -->
	
						<!-- footer content -->				
						<!-- /footer content -->
					</div>
				</div>
	
				<!-- datapicker -->
				<script type="text/javascript"
					src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js">
	    </script>
	
				<script type="text/javascript"
					src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
	    </script>
				<script type="text/javascript"
					src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js">
	    </script>
				<script type="text/javascript">
					$('#datetimepicker').datetimepicker({
						format : 'yyyy-MM-dd',
						language : 'pt-BR'
					});
				</script>
				<!-- jQuery if needed -->
				<script type="text/javascript"
					src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
				<script type="text/javascript">
					$("#sel1").click(function() {
						var open = $(this).data("isopen");
						if (open) {
							window.location.href = $(this).val()
						}
						//set isopen to opposite so next time when use clicked select box
						//it wont trigger this event
						$(this).data("isopen", !open);
					});
				</script>
				<!-- jQuery -->
				<script
					src="${pageContext.request.contextPath}/resources/vendors/jquery/dist/jquery.min.js"></script>
				<!-- Bootstrap -->
				<script
					src="${pageContext.request.contextPath}/resources/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
				<!-- FastClick -->
				<script
					src="${pageContext.request.contextPath}/resources/vendors/fastclick/lib/fastclick.js"></script>
				<!-- NProgress -->
				<script
					src="${pageContext.request.contextPath}/resources/vendors/nprogress/nprogress.js"></script>
				<!-- iCheck -->
				<script
					src="${pageContext.request.contextPath}/resources/vendors/iCheck/icheck.min.js"></script>
				<!-- Datatables -->
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net/js/jquery.dataTables.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-buttons-bs/js/buttons.bootstrap.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-buttons/js/buttons.flash.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-fixedheader/js/dataTables.fixedHeader.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-keytable/js/dataTables.keyTable.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-responsive/js/dataTables.responsive.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-responsive-bs/js/responsive.bootstrap.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/datatables.net-scroller/js/dataTables.scroller.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/jszip/dist/jszip.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/pdfmake/build/pdfmake.min.js"></script>
				<script
					src="${pageContext.request.contextPath}/resources/vendors/pdfmake/build/vfs_fonts.js"></script>
				<!-- validator -->
				<script
					src="${pageContext.request.contextPath}/resources/vendors/validator/validator.js"></script>
				<!-- Custom Theme Scripts -->
				<script
					src="${pageContext.request.contextPath}/resources/build/js/custom.min.js"></script>
	</body>
	</html>
