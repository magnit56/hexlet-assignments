package exercise.controller.users;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import exercise.model.Post;
import exercise.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

// BEGIN
@RestController
public class PostsController {
    private final List<Post> posts = new ArrayList<>();

    @GetMapping("/api/users/{id}/posts")
    public ResponseEntity<List<Post>> index(@PathVariable int id) {
        var result = posts.stream().filter(post -> post.getUserId() == id).toList();
        return ResponseEntity.ok()
                .header("X-Total-Count", String.valueOf(Data.getPosts().size()))
                .body(result);
    }

    @PostMapping("/api/users/{id}/posts")
    public ResponseEntity<Post> create(@RequestBody Post post, @PathVariable int id) {
        post.setUserId(id);
        posts.add(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(post);
    }
}
// END
