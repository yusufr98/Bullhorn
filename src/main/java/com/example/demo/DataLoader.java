package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public void run(String... strings) throws Exception{
        Message message;
        message = new Message("I miss the beach", "11/05/19","John Doe","https://i.imgur.com/ml4VjZw.jpg");
        messageRepository.save(message);

        message = new Message("Delish!", "11/07/19","Gordon Ramsey","https://www.gordonramsay.com/assets/Uploads/_resampled/CroppedFocusedImage108081050-50-Steak-Sandwich.jpg");
        messageRepository.save(message);

        message = new Message("Paris was wonderful", "11/11/19", "Yusuf Reyazuddin", "https://www.fodors.com/wp-content/uploads/2018/10/HERO_UltimateParis_Heroshutterstock_112137761.jpg");
        messageRepository.save(message);

        message = new Message("MVP","11/18/19","Yusuf Reyazuddin","https://i.imgur.com/pLBZAGe.jpg");
        messageRepository.save(message);

        message = new Message("Someone get me this for Christmas","11/19/19", "Yusuf Reyazuddin","https://cdn.pocket-lint.com/r/s/320x/assets/images/140007-games-review-nintendo-switch-review-image1-lp6zy9awm0.jpg?v1");
        messageRepository.save(message);

        message = new Message("Cancel Kanye!", "11/01/19", "Taylor Swift", "https://ksassets.timeincuk.net/wp/uploads/sites/55/2019/09/Kanye-West--920x584.jpg");
        messageRepository.save(message);

    }
}
