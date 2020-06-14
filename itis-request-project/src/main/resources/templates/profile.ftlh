<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Профиль</title>
    <link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,700,700i,600,600i">
    <link rel="stylesheet" href="/assets/fonts/simple-line-icons.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css">
    <link rel="stylesheet" href="/assets/css/styles.min.css">
</head>

<body>
<nav class="navbar navbar-light navbar-expand-lg fixed-top bg-white clean-navbar">
    <div class="container"><a class="navbar-brand logo" href="#">ITIS request</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse"
             id="navcol-1">
            <ul class="nav navbar-nav ml-auto">
                <li class="nav-item" role="presentation"><a class="nav-link" href="/logout">Выход</a></li>
            </ul>
        </div>
    </div>
</nav>
<main class="page login-page">
    <section class="clean-block clean-form dark">
        <div class="container">
            <div class="block-heading">
                <h2 class="text-info">Профиль</h2>
                <p>${user.name}, заполните поля формы, чтобы получить текст для копирования</p>
            </div>
            <form action="/profile" method="post">
                <div class="form-group">
                    <label for="name">Что:</label>
                    <input class="form-control item" name="what" type="text" id="name">
                </div>
                <div class="form-group">
                    <label for="name">Где:</label>
                    <input class="form-control item" name="place" type="text" id="name">
                </div>
                <div class="form-group">
                    <label for="name">Когда:</label>
                    <input class="form-control item" name="eventTime" type="text" id="name">
                </div>
                <div class="form-group">
                    <label for="name">Что нужно делать:</label>
                    <input class="form-control item" name="actions" type="text" id="name">
                </div>
                <div class="form-group">
                    <label for="name">Количество человек:</label>
                    <input class="form-control item" name="people" type="text" id="name">
                </div>
                <div class="form-group">
                    <label for="name">За участие:</label>
                    <input class="form-control item" name="profit" type="text" id="name">
                </div>
                <div class="form-group">
                    <label for="name">Запись:</label>
                    <input class="form-control item" name="control" type="text" id="name">
                </div>
                <div>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
                </div>
                <button class="btn btn-primary btn-block" type="submit">Создать пост</button>
            </form>
        </div>
    </section>
</main>
<script src="/assets/js/jquery.min.js"></script>
<script src="/assets/bootstrap/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>
<script src="/assets/js/script.min.js"></script>
</body>

</html>