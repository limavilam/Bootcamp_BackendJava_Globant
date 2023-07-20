package Gimnasio.entity;

import java.util.UUID;

public class Rutina {

    private UUID id;
    private String name;
    private int duration;
    private String difficultyLevel;
    private String description;

    public Rutina() {
    }

    public Rutina(UUID id, String name, int duration, String difficultyLevel, String description) {
        this.id=id;
        this.name = name;
        this.duration = duration;
        this.difficultyLevel = difficultyLevel;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Rutina: ID:" + this.id + "Nombre: "+this.name+", Duración:"+this.duration + ", Dificultad:"+this.difficultyLevel
                +", Descripción:"+this.description;
    }
}
