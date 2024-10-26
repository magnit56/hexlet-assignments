@import exercise.dto.users.UsersPage
@param UsersPage page

<html>
    <head>
        <title>Хекслет</title>
    </head>
    <body>
        <h1>${page.getHeader()}</h1>
        @if(page.getUsers().isEmpty())
            <p>Пока не добавлено ни одного курса</p>
        @else
            @for(var user : page.getUsers())
               <div>
                   <h2><a href="/users/${user.getId()}">${user.getEmail()}</a></h2>
               </div>
            @endfor
        @endif
    </body>
</html>