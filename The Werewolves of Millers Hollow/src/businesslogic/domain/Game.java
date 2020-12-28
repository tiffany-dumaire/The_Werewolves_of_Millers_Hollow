package businesslogic.domain;

/**
 * @author Tiffany Dumaire - Aaron Lazaroo - Clarence Rouvel
 */


public class Game {
	
    
	
	
	/**
     * Default constructor
     */
  
    /**

	public Game(int game_id, int numberOfPlayers, boolean status, int numberOfWerewolves, boolean hasWitch,boolean hasLittleGirl, boolean hasCupid, boolean hasHunter, boolean hasFortuneTeller, boolean finish,Phase currentPhase, boolean availableGame, String creatorUsername) {
		this.game_id = game_id;
		this.numberOfPlayers = numberOfPlayers;
		this.status = status;
		this.numberOfWerewolves = numberOfWerewolves;
		this.hasWitch = hasWitch;
		this.hasLittleGirl = hasLittleGirl;
		this.hasCupid = hasCupid;
		this.hasHunter = hasHunter;
		this.hasFortuneTeller = hasFortuneTeller;
		this.finish = finish;
		this.currentPhase = currentPhase;
		this.availableGame = availableGame;
		this.setCreatorUsername(creatorUsername);
	}
    /**
     * 
     * @return
     */
    public int isHasHunter() {
		return hasHunter;
	}

    public Game() {
    
    	
    }
    
    
    public Game(int numberOfPlayers, int status, int numberOfWerewolves, int hasWitch,
    		int hasLittleGirl, int hasCupid, int hasHunter, int hasFortuneTeller, int finish,
			Phase currentPhase, int availableGame) {
		super();
		this.numberOfPlayers = numberOfPlayers;
		this.status = status;
		this.numberOfWerewolves = numberOfWerewolves;
		this.hasWitch = hasWitch;
		this.hasLittleGirl = hasLittleGirl;
		this.hasCupid = hasCupid;
		this.hasHunter = hasHunter;
		this.hasFortuneTeller = hasFortuneTeller;
		this.finish = finish;
		this.currentPhase = currentPhase;
		this.availableGame = availableGame;
	
	}
    
    public Game(int game_id, int numberOfPlayers, int status, int numberOfWerewolves, int hasWitch,
    		int hasLittleGirl, int hasCupid, int hasHunter, int hasFortuneTeller, int finish,
			Phase currentPhase, int availableGame) {
		super();
		this.game_id = game_id;
		this.numberOfPlayers = numberOfPlayers;
		this.status = status;
		this.numberOfWerewolves = numberOfWerewolves;
		this.hasWitch = hasWitch;
		this.hasLittleGirl = hasLittleGirl;
		this.hasCupid = hasCupid;
		this.hasHunter = hasHunter;
		this.hasFortuneTeller = hasFortuneTeller;
		this.finish = finish;
		this.currentPhase = currentPhase;
		this.availableGame = availableGame;

	}

    public Game(int numberOfWerewolves, int status) {
    	
    }
	/**
     * 
     * @param hasHunter
     */
	public void setHasHunter(int hasHunter) {
		this.hasHunter = hasHunter;
	}

	/**
	 * @return the hasFortuneTeller
	 */
	public int isHasFortuneTeller() {
		return hasFortuneTeller;
	}

	/**
	 * @param hasFortuneTeller the hasFortuneTeller to set
	 */
	public void setHasFortuneTeller(int hasFortuneTeller) {
		this.hasFortuneTeller = hasFortuneTeller;
	}

	/**
	 * @return the finish
	 */
	public int isFinish() {
		return finish;
	}

	/**
	 * @param finish the finish to set
	 */
	public void setFinish(int finish) {
		this.finish = finish;
	}

	/**
	 * @return the currentPhase
	 */
	public Phase getCurrentPhase() {
		return currentPhase;
	}

	/**
	 * @param currentPhase the currentPhase to set
	 */
	public void setCurrentPhase(Phase currentPhase) {
		this.currentPhase = currentPhase;
	}

	/**
	 * @return the game_id
	 */
	public  int getGame_id() {
		return this.game_id;
	}

	/**
	 * @param game_id the game_id to set
	 */
	public  void setGame_id(int game_id) {
		this.game_id = game_id;
	}

	/**
	 * @return the numberOfPlayers
	 */
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	/**
	 * @param numberOfPlayers the numberOfPlayers to set
	 */
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	/**
	 * @return the status
	 */
	public int isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the numberOfWerewolves
	 */
	public int getNumberOfWerewolves() {
		return numberOfWerewolves;
	}

	/**
	 * @param numberOfWerewolves the numberOfWerewolves to set
	 */
	public void setNumberOfWerewolves(int numberOfWerewolves) {
		this.numberOfWerewolves = numberOfWerewolves;
	}

	/**
	 * @return the hasWitch
	 */
	public int isHasWitch() {
		return hasWitch;
	}

	/**
	 * @param hasWitch the hasWitch to set
	 */
	public void setHasWitch(int hasWitch) {
		this.hasWitch = hasWitch;
	}

	/**
	 * @return the hasLittleGirl
	 */
	public int isHasLittleGirl() {
		return hasLittleGirl;
	}

	/**
	 * @param hasLittleGirl the hasLittleGirl to set
	 */
	public void setHasLittleGirl(int hasLittleGirl) {
		this.hasLittleGirl = hasLittleGirl;
	}

	/**
	 * @return the hasCupid
	 */
	public int isHasCupid() {
		return hasCupid;
	}

	/**
	 * @param hasCupid the hasCupid to set
	 */
	public void setHasCupid(int hasCupid) {
		this.hasCupid = hasCupid;
	}

	/**
	 * @return the availableGame
	 */
	public int isAvailableGame() {
		return availableGame;
	}

	/**
	 * @param availableGame the availableGame to set
	 */
	public void setAvailableGame(int availableGame) {
		this.availableGame = availableGame;
	}
	
	/**
	 * @return the creatorUsername
	 */
	public String getCreatorUsername() {
		return creatorUsername;
	}
	/**
	 * @param creatorUsername the creatorUsername to set
	 */
	public void setCreatorUsername(String creatorUsername) {
		this.creatorUsername = creatorUsername;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return creatorUsername;
	}



	/**
     * 
     */
    private int game_id;

    /**
     * 
     */
    private int numberOfPlayers;

    /**
     * 
     */
    private int status;

    /**
     * 
     */
    private int numberOfWerewolves;

    /**
     * 
     */
    private int hasWitch;

    /**
     * 
     */
    private int hasLittleGirl;

    /**
     * 
     */
    private int hasCupid;

    /**
     * 
     */
    private int hasHunter;

    /**
     * 
     */
    private int hasFortuneTeller;

    /**
     * 
     */
    private int finish;


    /**
     * 
     */
    private Phase currentPhase;
    
    /**
     * 
     */
    private int availableGame;
    private boolean availableGame;
    private String creatorUsername;
}