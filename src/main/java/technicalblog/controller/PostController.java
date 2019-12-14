package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("posts")
    public String getUserPost(Model model) {
        List<Post> postList = postService.getOnePost();
        model.addAttribute("posts", postList);
        return "posts";
    }

}
