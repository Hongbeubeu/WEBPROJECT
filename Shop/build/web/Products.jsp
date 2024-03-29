<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <!--theme-style-->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
        <!--//theme-style-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--fonts-->
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <!--//fonts-->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close').on('click', function (c) {
                    $('.message').fadeOut('slow', function (c) {
                        $('.message').remove();
                    });
                });
            });
        </script>
        <script>$(document).ready(function (c) {
                $('.alert-close1').on('click', function (c) {
                    $('.message1').fadeOut('slow', function (c) {
                        $('.message1').remove();
                    });
                });
            });
        </script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="banner.jsp"></jsp:include>
        <div class="container">
            <div class="products">
                <h2 class=" products-in">PRODUCTS</h2>
                <div class=" top-products">
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in"><img  src="images/pic.jpg" alt="" />
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>	
                            <div class="top-content">
                                <h5><a href="single.html">Popular belief</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>2</span><span>0</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in"><img  src="images/pic1.jpg" alt="" />	
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>
                            <div class="top-content">
                                <h5><a href="single.html" >Simply random</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>6</span><span>0</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in"><img  src="images/pic2.jpg" alt="" />	
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>
                            <div class="top-content">
                                <h5> <a href="single.html">Classical Latin</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>1</span><span>5</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in"><img  src="images/pic3.jpg" alt="" />	
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>
                            <div class="top-content">
                                <h5><a href="single.html">Standard chunk</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>4</span><span>0</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class=" top-products">
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in"><img  src="images/pic4.jpg" alt="" />	
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>
                            <div class="top-content">
                                <h5><a href="single.html">Simply random</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>2</span><span>5</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in"><img  src="images/pic5.jpg" alt="" />	
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>
                            <div class="top-content">
                                <h5><a href="single.html">Popular belief</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>5</span><span>5</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="col-md-3 md-col">
                        <div class="col-md ">
                            <a href="single.html" class="compare-in"><img  src="images/pic6.jpg" alt="" />	
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>
                            <div class="top-content">
                                <h5> <a href="single.html">Classical Latin</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>3</span><span>0</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="col-md-3 md-col">
                        <div class="col-md ">
                            <a href="single.html" class="compare-in"><img  src="images/pic7.jpg" alt="" />	
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>
                            <div class="top-content">
                                <h5><a href="single.html">Standard chunk</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>6</span><span>0</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="top-products">
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in" ><img  src="images/pic8.jpg" alt="" />
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>
                            <div class="top-content">
                                <h5> <a href="single.html">Classical Latin</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>2</span><span>0</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in"><img  src="images/pic9.jpg" alt="" />
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>	
                            <div class="top-content">
                                <h5><a href="single.html">Standard chunk</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>1</span><span>5</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in"><img  src="images/pic10.jpg" alt="" />
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>	
                            <div class="top-content">
                                <h5><a href="single.html">Simply random</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>4</span><span>0</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="col-md-3 md-col">
                        <div class="col-md">
                            <a href="single.html" class="compare-in"><img  src="images/pic11.jpg" alt="" />
                                <div class="compare">
                                    <span>Add to Compare</span>
                                    <span>Add to Whislist</span>
                                </div>
                            </a>	
                            <div class="top-content">
                                <h5><a href="single.html">Popular belief</a></h5>
                                <div class="white">
                                    <a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span>2</span><span>9</span></p>
                                    <div class="clearfix"></div>
                                </div>
                            </div>							
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
