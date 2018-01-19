class Loader{
    get playerName() {
        return this._playerName;
    }

    set playerName(value) {
        this._playerName = value;
    }
    get gameTime() {
        return this._gameTime;
    }

    set gameTime(value) {
        this._gameTime = value;
    }
    get timeResult() {
        return this._timeResult;
    }

    set timeResult(value) {
        this._timeResult = value;
    }
    get timeStart() {
        return this._timeStart;
    }

    set timeStart(value) {
        this._timeStart = value;
    }
    constructor(){
        this.numCactus=0;
        this.numBullet=0;
        this.numNeedle=0;
        this.numEplode=0;
        this.numBonus=0;
        this.arrEntities = new Array();
        this.level = 1;
        this.timerID=0;

        this.firstTime=true;
        this._timeStart=0;
        this._timeResult=0;
        this._gameTime=new GameTime();
        this._playerName="";
    }
    loadLevel(level,difficult){
        this.level=level;
        if(level===1 && difficult==="normal")
        {
            let player = new Player();
            player.lifetime=500;
            player.pos_x = 0;
            player.pos_y = 1000;
            player.lastMove=1;
            player.myspeed=14;
            player.myname="player";
            player.pos_dy=15;

            this.arrEntities.push(player);
            getGameManager().player = player;

            let cactus1 = new Cactus();
            cactus1.pos_x = 900;
            cactus1.pos_norm=900;
            cactus1.pos_y = 1500;
            cactus1.move_x= 1;
            cactus1.view = 600;
            cactus1.lifetime=100;
            cactus1.shootToSide=1;
            cactus1.walkAround=125;
            cactus1.myspeed=10;
            cactus1.timeoutShoot=2000;
            cactus1.myname = "cactus"+this.getNextCactusNum();
            this.arrEntities.push(cactus1);


            let cactus3 = new Cactus();
            cactus3.pos_x = 2280;
            cactus3.pos_norm=cactus3.pos_x;
            cactus3.pos_y = 1000;
            cactus3.move_x = -1;
            cactus3.view = 600;
            cactus3.lifetime=100;
            cactus3.shootToSide=-1;
            cactus3.walkAround=250;
            cactus3.myspeed=10;
            cactus3.timeoutShoot=2000;
            cactus3.myname = "cactus"+this.getNextCactusNum();
            this.arrEntities.push(cactus3);

            let cactus4 = new Cactus();
            cactus4.pos_x = 3380;
            cactus4.pos_norm=cactus4.pos_x;
            cactus4.pos_y = 750;
            cactus4.move_x = 0;
            cactus4.view = 600;
            cactus4.lifetime=100;
            cactus4.myspeed=0;
            cactus4.shootToSide=1;
            cactus4.walkAround=0;
            cactus4.timeoutShoot=2000;
            cactus4.myname = "cactus"+this.getNextCactusNum();
            this.arrEntities.push(cactus4);

            let cactus5 = new Cactus();
            cactus5.pos_x = 5075;
            cactus5.pos_norm=cactus5.pos_x;
            cactus5.pos_y = 770;
            cactus5.move_x = 0;
            cactus5.view = 700;
            cactus5.lifetime=100;
            cactus5.shootToSide=-1;
            cactus5.walkAround=100;
            cactus5.myspeed=0;
            cactus5.timeoutShoot=2000;
            cactus5.myname = "cactus"+this.getNextCactusNum();
            this.arrEntities.push(cactus5);

            let cactus6 = new Cactus();
            cactus6.pos_x = 5975;
            cactus6.pos_norm=cactus6.pos_x;
            cactus6.pos_y = 590;
            cactus6.move_x = 0;
            cactus6.view = 550;
            cactus6.lifetime=100;
            cactus6.shootToSide=-1;
            cactus6.walkAround=0;
            cactus6.myspeed=0;
            cactus6.timeoutShoot=2000;
            cactus6.myname = "cactus"+this.getNextCactusNum();
            this.arrEntities.push(cactus6);

            let cactus7 = new Cactus();
            cactus7.pos_x = 4300;
            cactus7.pos_norm=cactus6.pos_x;
            cactus7.pos_y = 570;
            cactus7.move_x = 0;
            cactus7.view = 700;
            cactus7.lifetime=100;
            cactus7.shootToSide=-1;
            cactus7.walkAround=0;
            cactus7.myspeed=0;
            cactus7.timeoutShoot=2000;
            cactus7.myname = "cactus"+this.getNextCactusNum();
            this.arrEntities.push(cactus7);

            let mytime= new MyTime();
            this.arrEntities.push(mytime);
            //все противники созданы
            let numbullets = new NumBullets();
            let lvl = new Level(this.level);
            this.arrEntities.push(lvl);
            this.arrEntities.push(numbullets);
            let lifetime = new Lifetime();
            this.arrEntities.push(lifetime);

            this.startGame();
        }

        if(level===2 && difficult==="normal") {
            let player = new Player();
            player.lifetime = 100;
            player.pos_x = 0;
            player.pos_y = 0;
            player.lastMove = 1;
            player.myspeed = 15;
            player.myname = "player";
            player.pos_dy = 15;

            this.arrEntities.push(player);
            getGameManager().player = player;

            let cactus1 = new Cactus();
            cactus1.pos_x = 500;
            cactus1.pos_norm = 500;
            cactus1.pos_y = 0;
            cactus1.move_x = -1;
            cactus1.view = 600;
            cactus1.lifetime = 100;
            cactus1.shootToSide = -1;
            cactus1.walkAround = 0;
            cactus1.myspeed = 0;
            cactus1.timeoutShoot = 2000;
            cactus1.myname = "cactus" + this.getNextCactusNum();
            this.arrEntities.push(cactus1);

            let cactus2 = new Cactus();
            cactus2.pos_x = 980;
            cactus2.pos_norm = 1000;
            cactus2.pos_y = 0;
            cactus2.move_x = 1;
            cactus2.view = 700;
            cactus2.lifetime = 100;
            cactus2.shootToSide = 1;
            cactus2.walkAround = 180;
            cactus2.myspeed = 10;
            cactus2.timeoutShoot = 2000;
            cactus2.myname = "cactus" + this.getNextCactusNum();
            this.arrEntities.push(cactus2);

            let cactus3 = new Cactus();
            cactus3.pos_x = 1900;
            cactus3.pos_norm = 1900;
            cactus3.pos_y = 0;
            cactus3.move_x = -1;
            cactus3.view = 600;
            cactus3.lifetime = 100;
            cactus3.shootToSide = -1;
            cactus3.walkAround = 0;
            cactus3.myspeed = 0;
            cactus3.timeoutShoot = 2000;
            cactus3.myname = "cactus" + this.getNextCactusNum();
            this.arrEntities.push(cactus3);

            let cactus4 = new Cactus();
            cactus4.pos_x = 1450;
            cactus4.pos_norm = 1900;
            cactus4.pos_y = 0;
            cactus4.move_x = 1;
            cactus4.view = 800;
            cactus4.lifetime = 100;
            cactus4.shootToSide = 1;
            cactus4.walkAround = 0;
            cactus4.myspeed = 0;
            cactus4.timeoutShoot = 2000;
            cactus4.myname = "cactus" + this.getNextCactusNum();
            this.arrEntities.push(cactus4);

            let cactus5 = new Cactus();
            cactus5.pos_x = 3000;
            cactus5.pos_norm = 3000;
            cactus5.pos_y = 0;
            cactus5.move_x = -1;
            cactus5.view = 800;
            cactus5.lifetime = 100;
            cactus5.shootToSide = -1;
            cactus5.walkAround = 110;
            cactus5.myspeed = 10;
            cactus5.timeoutShoot = 2000;
            cactus5.myname = "cactus" + this.getNextCactusNum();
            this.arrEntities.push(cactus5);

            let cactus6 = new Cactus();
            cactus6.pos_x = 3860;
            cactus6.pos_norm = 3860;
            cactus6.pos_y = 0;
            cactus6.move_x = 1;
            cactus6.view = 500;
            cactus6.lifetime = 100;
            cactus6.shootToSide = 1;
            cactus6.walkAround = 150;
            cactus6.myspeed = 10;
            cactus6.timeoutShoot = 2000;
            cactus6.myname = "cactus" + this.getNextCactusNum();
            this.arrEntities.push(cactus6);


            let mytime= new MyTime();
            this.arrEntities.push(mytime);
            let numbullets = new NumBullets();
            let lvl = new Level(this.level);
            this.arrEntities.push(lvl);
            this.arrEntities.push(numbullets);
            let lifetime = new Lifetime();
            this.arrEntities.push(lifetime);

            this.startGame();
        }
    }

    startGame(){
       let sounds= new Array();
        sounds.push("sounds/shoot_cut.mp3");
        sounds.push("sounds/cactus_die_cut.mp3");
        sounds.push("sounds/throw_needle_cut.mp3");
        sounds.push("sounds/pickup_cut.mp3");
        sounds.push("sounds/moan_cut.mp3");
        getSoundManager().loadArray(sounds);
        getMapManager().loadMap("maps/level_"+this.level.toString()+".json");
        getEventsManager().setup();
        getSpriteManager().loadAtlas("sprites/sprites.json","sprites/sprites.png");
        for(let i =0; i<this.arrEntities.length;i++)
        {
            getGameManager().addEntity(this.arrEntities[i]);
        }
        this.timerID=setInterval(()=>{

            if(getGameManager().state===1) { //если игрок не убит
                getGameManager().clear(getContext());
                getGameManager().update(getContext());//Обновляем вектор направления движения
               // getGameManager().draw(getContext());
            }
            else
            {
                this.clearMyTimer();
                if(getGameManager().state===2) //пройден уровень
                {
                    if(getGameManager().maxLevel===getLoader().level)
                    {
                        getContext().fillStyle="#9707c6";
                        getContext().fillRect(0,0,1000,800);
                        getContext().font="italic 35pt Arial";
                        getContext().fillStyle = "blue";
                        getContext().fillText("you are winner",200,400);
                        getGameManager().saveRecord(this.level);
                    }
                    else
                    {
                        getGameManager().saveRecord(this.level);
                        start(++this.level);
                    }
                }
                if(getGameManager().state===0) //пройден последний уровень
                {
                    start(this.level);
                }
            }
        },30);

    }

    clearMyTimer(){
        clearInterval(this.timerID);
    }
    getNextCactusNum(){
        return (this.numCactus++).toString();
    }

    getNextBulletNum()
    {
        return (this.numBullet++).toString();
    }

    getNextNeedleNum()
    {
        return (this.numNeedle++).toString();
    }
    getNextExplodeNum()
    {
        return (this.numEplode++).toString();
    }
    getNextBonusNum()
    {
        return (this.numBonus++).toString();
    }
}
