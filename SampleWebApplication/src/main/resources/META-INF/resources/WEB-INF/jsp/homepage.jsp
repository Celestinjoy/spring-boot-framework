<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Celestin&apos;s App</title>

    <!-- External CSS link (you can replace this with your own stylesheet link) -->
    <link rel="stylesheet" href="styles.css">

    <style>
        /* Your existing styles remain unchanged */

        nav {
            background-color: #e3f2fd;
            padding: 0.5em;
            text-align: center; /* Center the buttons */
        }

        nav a {
            text-decoration: none;
            color: #007bff;
            margin: 0 1em;
            font-weight: bold;
        }

        /* Style the buttons */
        .nav-button {
            padding: 0.5em 1em;
            border: 2px solid #007bff;
            background-color: #ffffff;
            color: #007bff;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>

    <header>
        <h1>Welcome to Celestin&apos;s App ${name}</h1>
    </header>

    <nav>
        <a href="#home">Home</a>
        <a href="#about">About</a>
        <a href="#services">Services</a>
        <a href="#contact">Contact</a>

        <!-- Add buttons for men, women, and baby -->
        <button class="nav-button" onclick="navigateTo('men')">Men</button>
        <button class="nav-button" onclick="navigateTo('women')">Women</button>
        <button class="nav-button" onclick="navigateTo('baby')">Baby</button>
    </nav>

    <section id="home">
        <!-- Your existing content remains unchanged -->
    </section>

    <section id="about">
        <!-- Your existing content remains unchanged -->
    </section>

    <section id="services">
        <!-- Your existing content remains unchanged -->
    </section>

    <section id="contact">
        <!-- Your existing content remains unchanged -->
    </section>

    <footer>
        <!-- Your existing content remains unchanged -->
    </footer>

    <!-- Add your JavaScript scripts or external script links here -->
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.7.1/jquery.min.js"></script>

    <!-- Add a JavaScript function to handle button clicks and navigation -->
    <script>
        function navigateTo(category) {
            // You can add logic to handle navigation based on the category (men, women, baby)
            console.log('Navigating to ' + category);
        }
    </script>
</body>
</html>
