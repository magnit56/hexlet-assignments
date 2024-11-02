package exercise.dto.users;

import java.util.List;

import exercise.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsersPage {
    public List<User> users;
    public String term;
}