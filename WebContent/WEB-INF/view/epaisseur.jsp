<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Epaisseur</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Landing Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

    <script>
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
	
	<!-- animation css files -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/animation-aos.css">
	<link href='${pageContext.request.contextPath}/resources/css/aos.css' rel='stylesheet prefetch' type="text/css" media="all" />
	<!-- //animation css files -->

	<!-- css files -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel='stylesheet' type='text/css' /><!-- bootstrap css -->
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel='stylesheet' type='text/css' /><!-- custom css -->
    <link href="${pageContext.request.contextPath}/resources/css/fontawesome-all.css" rel="stylesheet"><!-- fontawesome css -->
	<!-- //css files -->
	
	<!-- google fonts -->
	<link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:200,200i,300,300i,400,400i,600,600i,700,700i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
	<!-- //google fonts -->
	
</head>
<body>

<!-- header -->
<header class="index-banner">
    <!-- nav -->
    <nav class="main-header">
      <div id="brand" data-aos="zoom-in-up">
        <div id="word-mark">
          <a href="Home"> 
            <img alt="" src="${pageContext.request.contextPath}/resources/images/logosodibet.png">
          </a>
        </div>
      </div>
      <div id="menu">
        <div id="menu-toggle">
          <div id="menu-icon">
            <div class="bar"></div>
            <div class="bar"></div>
            <div class="bar"></div>
          </div>
        </div>
        <ul class="text-center text-capitalize nav-agile" data-aos="zoom-in-up">
          <li>
            <a href="Predimensionnement" class="active">Pr�dimensionnement</a>
          </li>
             <li>
            <a href="Hypotheses" class="active">Hypoth�ses</a>
          </li>
             <li>
            <a href="Ask" class="active">Posez une question</a>
          </li>
          <li>
            <a href="Contact" class="active">Contact</a>
          </li>
             <li>
            <a href="Plaquette" class="active">Plaquette</a>
          </li>
          <li>
            <a href="Logout"><button  type="button" class="btn btn-secondary" >
              Log out
            </button></a>
          </li>
        </ul>
      </div>
    </nav>
    <!-- //nav -->
	<!-- banner -->
	<div class="banner layer" id="home">
		<div class="container">
			<div class="row banner-text">
				  <div class="slider-info col-lg-8">
					<div class="agileinfo-logo mt-5">
					</div>
					<br><h3 class="txt-w3_agile" data-aos="fade-down">Epaisseur du plancher</h3>
				</div>
			</div>
		</div>
		
		
		
	</div>
	<!-- //banner -->
</header>
<!-- //header -->
<section class="contact py-5" id="contact">
	<div class="container py-lg-3">
		<form action="#" method="post" data-aos="fade-up">
			<div class="row">
				<div class="col-md-6 styled-input mt-0">
				<h3>Charges d'exloitations (daN/m�)<br></h3>
					<select class="form-control" name="charge" required>
						<option class="form-control" selected value="150">150
						<option class="form-control" value="250">250
						<option class="form-control" value="400">400
						<option class="form-control" value="500">500
						<option class="form-control" value="150/T">150/T
						<option class="form-control" value="100/T">100/T
					</select>
				</div>
				<div class="col-md-6 styled-input mt-md-0">
				</div> 
			</div>
			<br>	
			
			<div class="row">
				<div class="col-md-6 styled-input">
				<h3>La port�e :<br></h3>
				<span class="erreur">${erreur['erreur_portee']}</span>
					<input type="text" name="portee" placeholder="Ex : 7.9" required>
					<p><a data-aos="fade-up" href="#" data-toggle="modal" data-target="#exampleModalCenter1" role="button"><i class="fas mr-2 fa-question-circle"></i></a></p>
				</div> 
			</div>
			<div class="click text-center mt-3">
				<input type="submit" name ="calcul" value="Afficher r�sultat">
			</div>
		</form>
	</div>
	
</section>
<div class="modal fade" id="exampleModalCenter1" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenter1" aria-hidden="true">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title text-capitalize text-center" id="exampleModalLongTitle">Explication</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				Cette fonctionnalit� permet de d�terminer l'�paisseur minimale qui permet d'atteindre une port�e cible pour des charges d'exploitation donn�es.
			</div>
			<div class="modal-footer">
			<form method="post" action="#"><input type="submit" class ="btn btn-primary" name="dontShow" value="Ne plus afficher">
					</form>
				<button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
			</div>
		</div>
	</div>
</div>

    <!-- js -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery-2.2.3.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
    <!-- //js -->
	
	<!-- animation js -->
	<script src='${pageContext.request.contextPath}/resources/js/aos.js'></script>
	<script>
		AOS.init({
            easing: 'ease-out-back',
            duration: 1000
        });

    </script>
	<!-- //animation js -->

	<!-- testimonials  Responsiveslides -->
    <script src="${pageContext.request.contextPath}/resources/js/responsiveslides.min.js"></script>
    <script>
        // You can also use"$(window).load(function() {"
        $(function () {
            // Slideshow 4
            $("#slider3").responsiveSlides({
                auto: true,
                pager: true,
                nav: false,
                speed: 500,
                namespace: "callbacks",
                before: function () {
                    $('.events').append("<li>before event fired.</li>");
                },
                after: function () {
                    $('.events').append("<li>after event fired.</li>");
                }
            });

        });

        
    </script>
    <!-- //testimonials  Responsiveslides -->
<c:if test="${utilisateur.getPortee_2()==0}">
<script>
   
    $(document).ready(function() {
    	  $('#exampleModalCenter1').modal('show');
    	});
</script>
</c:if>
	<!-- sticky nav bar-->
	<script>
		$(() => {

		  //On Scroll Functionality
		  $(window).scroll(() => {
			var windowTop = $(window).scrollTop();
			windowTop > 100 ? $('nav').addClass('navShadow') : $('nav').removeClass('navShadow');
			windowTop > 100 ? $('ul.nav-agile').css('top', '50px') : $('ul.nav-agile').css('top', '160px');
		  });

		  //Click Logo To Scroll To Top
		  $('#logo').on('click', () => {
			$('html,body').animate({
			  scrollTop: 0
			}, 500);
		  });

		 /*
		  //Smooth Scrolling Using Navigation Menu
		  $('a[href*="#"]').on('click', function (e) {
			$('html,body').animate({
			  scrollTop: $($(this).attr('href')).offset().top - 100
			}, 500);
			e.preventDefault();
		  });
		 */

		  //Toggle Menu
		  $('#menu-toggle').on('click', () => {
			$('#menu-toggle').toggleClass('closeMenu');
			$('ul').toggleClass('showMenu');

			$('li').on('click', () => {
			  $('ul').removeClass('showMenu');
			  $('#menu-toggle').removeClass('closeMenu');
			});
		  });

		});
	</script>
	<!-- //sticky nav bar -->

	<script src="${pageContext.request.contextPath}/resources/js/smoothscroll.js"></script><!-- Smooth scrolling -->

    <!-- start-smoth-scrolling -->
    <script src="${pageContext.request.contextPath}/resources/js/move-top.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/easing.js"></script>
    <script>
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 900);
            });
        });
    </script>
    <script>
        $(document).ready(function () {
            /*
			var defaults = {
				  containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			 };
			*/

            $().UItoTop({
                easingType: 'easeOutQuart'
            });

        });
    </script>
    <!-- //end-smoth-scrolling -->

</body>
</html>