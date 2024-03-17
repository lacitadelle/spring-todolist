<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>Please log in to use the application</h1>
        <pre>${error}</pre>
        <form method="post">
            <label for="username">Username: </label>
            <input id="username" type="text" name="username" />

            <label for="password">Password:</label>
            <input id="password" type="password" name="password"/>
            <button type="submit">Login</button>
        </form>
    </body>
</html>