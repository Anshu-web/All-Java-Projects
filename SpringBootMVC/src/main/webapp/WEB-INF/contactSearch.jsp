<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>P&G::Home</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.5 -->
  <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="/font/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="/font/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/dist/css/AdminLTE.min.css">

  <link rel="stylesheet" href="/dist/css/skins/skin-blue.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="/zjs/html5shiv.min.js"></script>
  <script src="/js/respond.min.js"></script>
  <![endif]-->
	<style>
	.left {
				box-shadow: 5px 0 5px -5px #333;
			}
	</style>
	
	
</head>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="dashboard.html" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini">Corbus<br> LLC</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><img src="/images/logo.png" width="62" height="29" alt=""/></span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
  <!--    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>-->
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
         
          <li class="dropdown user user-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
            
              <i class="fa fa-user fa-lg"></i>
           
              <span class="hidden-xs">James</span>
            </a>
            <ul class="dropdown-menu">
              <!-- The user image in the menu -->
              <li class="user-header">
                <p>
                  James Stewart - Developer
                  <small>Member since Nov. 2012</small>
                </p>
              </li>
              <!-- Menu Body -->
              
              <!-- Menu Footer
              <li class="user-footer">
                <div class="pull-right">
                  <a href="#" class="btn btn-default btn-flat">Sign out</a>
                </div>
              </li>-->
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button -->
          <li>
            <a href="login.html"><i class="fa fa-sign-out fa-lg" title="Logout"></i></a>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <!--<aside class="main-sidebar">

       <section class="sidebar">


			<ul class="sidebar-menu">
			
				<li class="active"><a href="dashboard.html"><i class="fa fa-tachometer"></i> <span>Home</span></a></li>
				<li><a href="#"><i class="fa fa-ioxhost"></i> <span>Line Chart</span></a></li>
				<li><a href="#"><i class="fa fa-book"></i> <span>Interactive Slider</span></a></li>
				<li><a href="#"><i class="fa fa-list-alt"></i> <span>Bokeh Graphics</span></a></li>
				<li class="treeview">
					<a href="#">
						<i class="fa fa-eye"></i>
						<span>Treemap</span>
						<i class="fa fa-angle-left pull-right"></i>
					</a>
					<ul class="treeview-menu">
						<li class="active"><a href="myparts.html"><i class="fa fa-link"></i>DrillDown</a></li>
						<li class="active"><a href="search.html"><i class="fa fa-search"></i>ColourDensity</a></li>
						
					</ul>
				</li>
				
			</ul>
			
		</section>

  </aside>-->

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <!--<section class="content-header">
      <h1>
        Dashboard
      </h1>
    </section>-->

    <!-- Main content -->
    <section class="content">
      <!-- Small boxes (Stat box) -->
      
      <!-- /.row -->
      <!-- Main row -->
  	<div class="row marginBlocker">
			
			 <div class="col-md-12 mar20">
				 
				 <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Search</h3>

              <!--<div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>-->
            </div>
            <div class="box-body chart-responsive">
              
				<div class="col-md-3">
                <div class="form-group">
                  <label>Date</label>
					
					<div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                  </div>
					
                  <input type="date" class="form-control" id="">
						</div>
						
						
                </div>
       
              </div>
				
				
				
				<div class="col-md-3">
                <div class="form-group">
                  <label>Time</label>
					<div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-clock-o"></i>
                  </div>
                      <input type="time" class="form-control" id="">
                </div>  </div>
            
              </div>
				
				<div class="col-md-3">
                <div class="form-group">
                  <label>Initiated By</label>
                    <input type="type" class="form-control" id="">
                </div>
    
              </div>
				
				<div class="col-md-3">
                <div class="form-group">
                  <label>Ref</label>
                   <input type="type" class="form-control" id="">
                </div>
             
              </div>
				
				<div class="col-md-2">
                <div class="form-group">
                  <label>Medium</label>
                  <select class="form-control select2 select2-hidden-accessible" style="width: 100%;" data-select2-id="1" tabindex="-1" aria-hidden="true">
                    <option selected="selected">Email</option>
                    <option>Mail</option>
                    </select>
                </div>
       
              </div>
				
				
				<div class="col-md-2">
                <div class="form-group">
                  <label>Reason For Contact</label>
                  <select class="form-control">
                    <option>Avalability</option>
                    <option>Avalability</option>
                    </select>
                </div>
       
              </div>
				
				<div class="col-md-2">
                <div class="form-group">
                  <label>Brand</label>
                  <select class="form-control">
                    <option>Active 55</option>
                    <option>Active 66</option>
                    </select>
                </div>
       
              </div>
				
				
				<div class="col-md-3">
                <div class="form-group">
                  <label>Product</label>
                  <select class="form-control">
                    <option>General</option>
                    <option>Mail</option>
                    </select>
                </div>
       
              </div>
				
				<div class="col-md-1 pull-right"	>
                <div class="form-group">
                  <label style="color: #ffffff;">.</label>
                   <button type="submit" class="btn btn-primary btn-block">Search</button>
                </div>
       
              </div>
				
				
            </div>
            <!-- /.box-body -->
          </div>
		
		</div></div>
		
		
				
      <!-- /.row (main row) -->

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <footer class="main-footer">
    
    <!-- Default to the left -->
    <strong>Copyright &copy; 2019 <a href="#">Corbus LLC</a>.</strong> All rights reserved.
  </footer>


  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 2.2.0 -->
<script src="/plugins/jQuery/jQuery-2.2.0.min.js"></script>
<!-- Bootstrap 3.3.5 -->
<script src="/bootstrap/js/bootstrap.min.js"></script>

<!-- AdminLTE App -->
<script src="/dist/js/app.min.js"></script>

<!-- FLOT CHARTS -->

<!-- Page script -->

</body>
</html>
