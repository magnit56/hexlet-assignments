@import exercise.dto.users.UsersPage

@param UsersPage page

@template.layout.page(
content = @`
    <form action="/users" method="get">
        <input type="search" name="term" value="${page.getTerm()}" />
        <input type="submit" value="Search" />
    </form>
    <ul>
        @for (var user: page.getUsers())
            <li><a href="/users/${user.getId()}">${user.getLastName()} ${user.getFirstName()}</a></li>
        @endfor
    </ul>
`
)
