<!DOCTYPE html>
<html lang="en">
<head>
<title>Espace Administrateur</title>
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
      </div>
    </nav>
    <!-- //nav -->
	<!-- banner -->
	<div class="banner layer" id="home">
		<div class="container">
			<div class="row banner-text" >
				<div class="col-lg-4 col-md-2 mt-lg-0 mt-5 banner-form" data-aos="fade-right"></div>
				<div class="col-lg-4 col-md-8 mt-lg-0 mt-5 banner-form" data-aos="fade-left">
				<br>
					<h5><i class="fas mr-2 fa-laptop"></i>Administration !</h5>
					<br>
					<form action="#" class="mt-4" method="post">
						
						<input class="form-control" type="text" name="id" placeholder="Admin ID" required />
						<span class="erreur">${form.erreurs['id']}</span>
						
						<input class="form-control" type="password" name="password" placeholder="Mot de passe" required/>
						<span class="erreur">${form.erreurs['password']}</span>
						<input class="form-control text-capitalize" type="submit" value="Connexion">
					</form>
					
						<br><br><br><br><br><br>
				</div>
			</div>
		</div>
	</div>
	<!-- //banner -->

</header>
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