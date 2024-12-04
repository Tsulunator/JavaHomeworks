public class WeatherForecash{
    private String cityName;
    private double windSpeed; // in km/h
    private int rainPercentage; // percentage of area that will be rained
    private boolean willRain;
    private boolean willBeCloudy;
    private boolean willBeSunny;

    public WeatherForecash(String cityName, double windSpeed, int rainPercentage, boolean willRain, boolean willBeCloudy, boolean willBeSunny) {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.rainPercentage = rainPercentage;
        this.willRain = willRain;
        this.willBeCloudy = willBeCloudy;
        this.willBeSunny = willBeSunny;
    }

    // Getters and Setters
    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public double getWindSpeed(){
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed){
        this.windSpeed = windSpeed;
    }

    public int getRainPercentage(){
        return rainPercentage;
    }

    public void setRainPercentage(int rainPercentage){
        this.rainPercentage = rainPercentage;
    }

    public boolean isWillRain(){
        return willRain;
    }

    public void setWillRain(boolean willRain){
        this.willRain = willRain;
    }

    public boolean isWillBeCloudy(){
        return willBeCloudy;
    }

    public void setWillBeCloudy(boolean willBeCloudy){
        this.willBeCloudy = willBeCloudy;
    }

    public boolean isWillBeSunny(){
        return willBeSunny;
    }

    public void setWillBeSunny(boolean willBeSunny){
        this.willBeSunny = willBeSunny;
    }

    public void printWeatherForecast(){
        System.out.println("Weather for " + cityName + ":");
        System.out.println("Wind Speed: " + windSpeed + " km/h");
        System.out.println("Rain Percentage: " + rainPercentage + "%");
        System.out.println("Will it rain? " + (willRain ? "Yes" : "No"));
        System.out.println("Will it be cloudy? " + (willBeCloudy ? "Yes" : "No"));
        System.out.println("Will it be sunny? " + (willBeSunny ? "Yes" : "No"));
    }

    public boolean adviseForWalk(){
        if(!willRain && (willBeSunny || windSpeed <= 15)){
            return true;
        }
        return false;
    }
}