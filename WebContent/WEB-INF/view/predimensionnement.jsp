<!DOCTYPE html>
<html lang="en">
<head>
<title>Pr�dimensionnement</title>
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
    </header>
	<!-- banner -->
	<div class="banner layer" id="home">
		<div class="container">
			<!-- banner bottom -->
			</div>
<!-- //banner -->
<section class="banner-bottom py-5">
</section>
</div><div class="container py-md-3"></div>
	
	<section class="choose py-5" id="choose">
	<div class="container py-md-3">
		<h3 class="heading mb-5 text-center" data-aos="zoom-in">Fonctionnalit�s</h3>
		<div class="feature-grids row">
			<div class="col-lg-4 col-md-6" data-aos="fade-right">
				<a href="Portee">
				<div class="f1 icon1 p-4">
					<img alt="porteeImage" src="${pageContext.request.contextPath}/resources/images/portee.jpg" width="25%" height="25%">
					<h3 class="my-3">Port�e limite</h3>
					<p>D�termination de la port�e limite par la fl�che</p>
				</div>
				</a>
			</div>
			<div class="col-lg-4 col-md-6" data-aos="fade-up">
				<a href="Epaisseur">
				<div class="f1 icon2 p-4">
					<img alt="epaisseurImage" src="${pageContext.request.contextPath}/resources/images/epaisseur.jpg" width="25%" height="25%">
					<h3 class="my-3">Epaisseur du plancher</h3>
					<p>D�termination de l'�paisseur du plancher</p>
				</div>
				</a>
			</div>
			<div class="col-lg-4 col-md-6 mt-lg-0 mt-4" data-aos="fade-left">
				<a href="Hauteur">
				<div class="f1 icon3 p-4">
					<img alt="hauteurImage" src="${pageContext.request.contextPath}/resources/images/hauteur.jpg" width="25%" height="25%">
					<h3 class="my-3">Hauteur sous plafond</h3>
					<p>Calcul de la hauteur sous plafond nette</p>
				</div>
				</a>
			</div>
			
			<div class="col-lg-4 col-md-6 mt-lg-0 mt-4 " data-aos="fade-left">
				<a href="Litrage">
				<div class="f1 icon2 p-4">
					<img alt="litrageImage" src="${pageContext.request.contextPath}/resources/images/litrage.jpg" width="25%" height="25%">
					<h3 class="my-3">Litrage</h3>
					<p>Calcul du litrage</p>
				</div>
				</a>
			</div>
		</div>
	</div>
</section>
<!-- //header -->

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