<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Онлайн библиотека::Вход</title>
        <link href="css/style_index.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <div class="main">

            <div class="content">
                <p class="title"><span class="text"><img src="images/libr.jpg" width="600" height="120" hspace="10" vspace="10" align="middle"></span></p>
                <p class="title">Library</p>
                <p class="text">Добро пожаловать в онлайн библиотеку. Доступны функции поиска, просмотра, сортировки и др.</p>
                <p class="text">Проект находится в разработке, дизайн и функционал постоянно дорабатываться.</p>
                <p class="text">По всем вопросам обращайтесь по адресу <a href="mailto:allexek@gmail.com">allexek@gmail.com</a></p>
                <p>&nbsp;</p>

            </div>

            <div class="login_div">
                <p class="title">Для входа введите свои данные:</p>
                <form class="login_form" name="username" action="pages/main.jsp" method="POST">
                    Имя: <input type="text" name="username" value="" size="20" />
                    <input type="submit" value="Войти" />
                </form>

            </div>

            <div class="footer">
                Разработчик: Алексей Климов 2018 г
            </div>
        </div>

    </body>
</html>
