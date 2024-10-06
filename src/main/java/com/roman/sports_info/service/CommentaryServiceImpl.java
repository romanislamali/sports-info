package com.roman.sports_info.service;

import com.roman.sports_info.repository.CommentaryRepo;
import com.roman.sports_info.serviceImpl.CommentaryService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

@Service
public class CommentaryServiceImpl implements CommentaryService {
    private CommentaryRepo commentaryRepo;

    public CommentaryServiceImpl(CommentaryRepo commentaryRepo) {
        this.commentaryRepo = commentaryRepo;
    }

    @Override
    public Optional findById(int id) {
        return commentaryRepo.findById(id);
    }

    public static void getData(){
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    // .uri(URI.create("https://cricbuzz-cricket.p.rapidapi.com/mcenter/v1/100238"))

                    //conmentry
                    .uri(URI.create("https://cricbuzz-cricket.p.rapidapi.com/mcenter/v1/100238/comm"))
                    .header("x-rapidapi-key", "93516eb36fmshbc2f727ce7c708ap1f0da7jsn41fda9548ae9")
                    .header("x-rapidapi-host", "cricbuzz-cricket.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
