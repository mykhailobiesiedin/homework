public class Main {
    public static void main(String[] args) {

        int longWallWidth = 15;
        int longWallHeight = 10;
        int shortWallWidth = 12;
        int shortWallHeight = 9;
        int doorHeight = 5;
        int doorWidth = 2;
        int windowHeight = 4;
        int windowWidth = 3;
        int wallpaperHeight = 13;
        int wallpaperWidth = 2;

        int longWallArea = longWallWidth * longWallHeight;
        int shortWallArea = shortWallWidth * shortWallHeight;
        int doorArea = doorHeight * doorWidth;
        int windowArea = windowHeight * windowWidth;
        int windowDoorArea = doorArea + windowArea;
        int roomArea = (longWallArea + shortWallArea) *2;
        int withoutStuff = roomArea - windowDoorArea;
        int wallpaperArea = wallpaperHeight * wallpaperWidth;
        int wallpaperAmount = withoutStuff / wallpaperArea;

        System.out.println(longWallWidth + "*" + longWallHeight + "=" + longWallArea);
        System.out.println(shortWallWidth + "*" + shortWallHeight + "=" + shortWallArea);
        System.out.println((longWallArea + "+" + shortWallArea) + "*2" + "=" +roomArea);
        System.out.println(doorHeight + "*" + doorWidth + "=" + doorArea);
        System.out.println(windowHeight + "*" + windowWidth + "=" + windowArea);
        System.out.println(doorArea +"+" + windowArea + "=" + windowDoorArea);
        System.out.println( roomArea + "-" + windowDoorArea + "=" + withoutStuff);
        System.out.println(wallpaperHeight + "*" + wallpaperWidth + "=" + wallpaperArea);
        System.out.println(withoutStuff + "/" + wallpaperArea + "=" + wallpaperAmount);


    }
}