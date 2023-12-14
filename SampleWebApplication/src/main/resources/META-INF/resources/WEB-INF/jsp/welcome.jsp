<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Celestin&apos;s Fashion Store</title>

    <!-- External CSS link (you can replace this with your own stylesheet link) -->
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f9fa;
            color: #495057;
        }

        header {
            background-color: #343a40;
            color: #ffffff;
            padding: 1em 0;
            text-align: center;
        }

        nav {
            background-color: #e3f2fd;
            padding: 0.5em;
        }

        nav a {
            text-decoration: none;
            color: #007bff;
            margin: 0 1em;
            font-weight: bold;
        }

        section {
            max-width: 800px;
            margin: 2em auto;
            padding: 1em;
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        footer {
            background-color: #343a40;
            color: #ffffff;
            padding: 1em 0;
            text-align: center;
        }
    </style>
</head>
<body>

    <header>
        <h1>Hi ${name}, Welcome to Celestin&apos;s Fashion Store </h1>
    </header>

    <nav>
        <a href="#home">Home</a>
        <a href="#about">About</a>
        <a href="#services">Services</a>
        <a href="#contact">Contact</a>
    </nav>

    <section id="home">
        <h2>Celestin&apos;s Fashion Store</h2>
        <p>Where kerala comes to shop </p>
    </section>

    <section id="services">
            <h2>Our Services</h2>
            <ul>
                <a href="men" class="btn btn-success">MEN </a>
                <a href="women" class="btn btn-success">WOMEN </a>
                <a href="kids" class="btn btn-success">KIDS </a>
                <a href="babies" class="btn btn-success">BABIES </a>

            </ul>
    </section>

    <section id="about">
        <h2>About Us</h2>
        <p>25 years of Excellence in Fashion</p>
    </section>

    <section id="contact">
        <h2>Contact Us</h2>
        <p>Celestin ,221B Baker Street.</p>
    </section>

    <footer>
        <p>&copy; 2023 Celestin&apos;s App. All rights reserved.</p>
    </footer>

    <!-- Add your JavaScript scripts or external script links here -->
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.7.1/jquery.min.js"></script>

</body>
</html>
