<!-- src/main/jte/courses/show.jte -->
@import exercise.dto.users.UserPage
@param UserPage page

<main>
    <h1>${page.getUser().getEmail()}</h1>
    <h1>${page.getUser().getLastName()}</h1>
    <h1>${page.getUser().getFirstName()}</h1>
</main>