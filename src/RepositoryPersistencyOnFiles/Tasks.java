package RepositoryPersistencyOnFiles;

public class Tasks {

    private int id;
    private String description;
    private boolean concluded;

    public Tasks(int id, String description, boolean concluded) {
        this.id = id;
        this.description = description;
        this.concluded = concluded;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isConcluded() {
        return concluded;
    }

    public void setConcluded(boolean concluded) {
        this.concluded = concluded;
    }

    @Override
    public String toString() {
        return id + ";" + description + ";" + concluded;
    }

    public static Tasks fromString(String rows) {
        String[] parts = rows.split(";");
        return new Tasks(
                Integer.parseInt(parts[0]), // return Id
                parts[1], // return description
                Boolean.parseBoolean(parts[2]) // return concluded
        );
    }


}
