package com.github.oycharming.pattern.facade;

/**
 * @author Charming
 * @since 2016-09-07 09:35
 */
public class HomeTheaterFacade {
    private Light light;
    private Popper popper;
    private Screen screen;
    private MoviePlayer player;

    public HomeTheaterFacade() {
        this.light = new Light();
        this.popper = new Popper();
        this.screen = new Screen();
        this.player = new MoviePlayer();
    }

    public HomeTheaterFacade(Light light, Popper popper, Screen screen, MoviePlayer player) {
        this.light = light;
        this.popper = popper;
        this.screen = screen;
        this.player = player;
    }

    /**
     * 看电影连续的一个动作，都封装到一个函数里.
     * @param movie
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        light.dim(10);
        screen.down();
        player.on();
        player.play(movie);
    }

    /**
     * 调用的人只需要知道要结束观看电影，不需要了解关闭放映的具体细节.
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        light.on();
        screen.up();
        player.off();
    }
}
