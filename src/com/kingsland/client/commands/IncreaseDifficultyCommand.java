package com.kingsland.client.commands;

import com.kingsland.blockchain.Blockchain;
import com.kingsland.client.annotations.Command;

@Command("increase difficulty")
public class IncreaseDifficultyCommand implements Executable {
    @Override
    public void execute(Blockchain blockchain) {
        blockchain.setDifficulty(blockchain.getDifficulty() + 1);
        System.out.printf("Blockchain difficulty increased. Difficulty is now %d\n",
                blockchain.getDifficulty());
    }
}
