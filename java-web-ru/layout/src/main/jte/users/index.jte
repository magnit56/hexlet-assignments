@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
        <a href="/users/build">New User</a>
        @for(var user : page.getUsers())
            <a href="/users/${user.getId()}">
                ${user.getEmail()} ${user.getFirstName()} ${user.getLastName()}
            </a>
        @endfor
    `
)