package composite.learn;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> children;


    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        for (FileSystem child : children) {
            child.ls();
        }
    }

    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }

}

