package com.mike.pj.creational.builder;

import java.time.Year;

public record Car(String model, String year, Integer seats, String engine, String color) {

    private Car(Builder builder){
        this(builder.model, builder.year, builder.seats, builder.engine, builder.color);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(model != null && !model.isBlank()) sb.append("model: ").append(model).append(", ");
        if(year != null && !year.isBlank()) sb.append("year: ").append(year).append(", ");
        if(seats != null && seats != 0) sb.append("seats: ").append(seats).append(", ");
        if(engine != null && !engine.isBlank()) sb.append("engine: ").append(engine).append(", ");
        if(color != null && !color.isBlank()) sb.append("color: ").append(color);
        return sb.toString();
    }

    public static class Builder {
        private final String model;
        private String year;
        private int seats;
        private String engine;
        private String color;

        public Builder(String model){
            this.model = model;
        }

        public Builder year(String year){
            this.year = year;
            return this;
        }

        public Builder seats(int seats){
            this.seats = seats;
            return this;
        }

        public Builder engine(String engine){
            this.engine = engine;
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Car build() {
            validate();
            return new Car(this);
        }

        private void validate() throws IllegalStateException{
            StringBuilder sb = new StringBuilder();
            if(model == null || model.isBlank())
                sb.append("model must not be null.");
            if(Year.parse(year).isAfter(Year.now()))
                sb.append("year must not be after current year");
            if(!sb.isEmpty())
                throw new IllegalStateException(sb.toString());
        }
    }
}
