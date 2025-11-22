package BackupFactory;

import BackupFactory.Interface.BackupService;

public abstract class BackupFactory implements BackupService {

    private BackupService buildBackUpFactory;

    public BackupService getBuildBackUpFactory(){
        return buildBackUpFactory;
    }

    public BackupService setBuildBackUpFactory(){
        return this.buildBackUpFactory = buildBackUpFactory;
    }

}
