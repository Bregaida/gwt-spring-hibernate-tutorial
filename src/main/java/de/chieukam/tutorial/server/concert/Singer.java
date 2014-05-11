package de.chieukam.tutorial.server.concert;

import org.springframework.stereotype.Component;

@Component
public class Singer implements Performance {

  public void perform() throws Exception {
    for (int cii = 0; cii < 10; cii++)
      System.out.println("Sing sing sgin..........");
  }

}
