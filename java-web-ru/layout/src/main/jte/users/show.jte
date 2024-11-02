@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
content = @`
    <div>
        ${page.getUser().getEmail()} ${page.getUser().getFirstName()} ${page.getUser().getLastName()}
    </div>
    <br>
`
)