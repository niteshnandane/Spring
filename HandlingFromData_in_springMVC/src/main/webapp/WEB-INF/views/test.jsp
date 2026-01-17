<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nature Beauty</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "Segoe UI", sans-serif;
        }

        body {
            background-color: #f4f8f5;
            color: #2f4f2f;
            line-height: 1.6;
        }

        header {
            height: 100vh;
            background: linear-gradient(
                rgba(0, 0, 0, 0.4),
                rgba(0, 0, 0, 0.4)
            ),
            url("https://images.unsplash.com/photo-1500530855697-b586d89ba3ee") center/cover no-repeat;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            color: white;
        }

        header h1 {
            font-size: 3.5rem;
            margin-bottom: 10px;
        }

        header p {
            font-size: 1.2rem;
            max-width: 600px;
        }

        section {
            padding: 60px 10%;
        }

        .about {
            text-align: center;
        }

        .about h2 {
            font-size: 2.5rem;
            margin-bottom: 20px;
        }

        .gallery {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
        }

        .gallery img {
            width: 100%;
            height: 250px;
            object-fit: cover;
            border-radius: 10px;
            transition: transform 0.4s;
        }

        .gallery img:hover {
            transform: scale(1.05);
        }

        footer {
            background-color: #2f4f2f;
            color: white;
            text-align: center;
            padding: 20px;
        }

        footer p {
            font-size: 0.9rem;
        }

        @media (max-width: 768px) {
            header h1 {
                font-size: 2.5rem;
            }
        }
    </style>
</head>
<body>

<header>
    <div>
        <h1>Nature’s Beauty</h1>
        <p>Experience the peace, purity, and power of the natural world</p>
    </div>
</header>

<section class="about">
    <h2>About Nature</h2>
    <p>
        Nature gives us life, peace, and inspiration. From green forests to
        blue oceans, every element plays a vital role in maintaining balance.
        Protecting nature means protecting our future.
    </p>
</section>

<section>
    <h2 style="text-align:center; margin-bottom:30px;">Nature Gallery</h2>
    <div class="gallery">
        <img src="https://images.unsplash.com/photo-1501785888041-af3ef285b470">
        <img src="https://images.unsplash.com/photo-1507525428034-b723cf961d3e">
        <img src="https://images.unsplash.com/photo-1441974231531-c6227db76b6e">
        <img src="https://images.unsplash.com/photo-1500534314209-a25ddb2bd429">
        <img src="https://images.unsplash.com/photo-1470770903676-69b98201ea1c">
        <img src="https://images.unsplash.com/photo-1469474968028-56623f02e42e">
    </div>
</section>

<footer>
    <p>© 2026 Nature Beauty | Designed with 🌿</p>
</footer>

</body>
</html>
