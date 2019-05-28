package com.kingsland.client.commands;

import com.kingsland.blockchain.Block;
import com.kingsland.blockchain.Blockchain;
import com.kingsland.client.annotations.Command;

import java.util.List;

@Command("show blocks")
public class ShowBlocksCommand implements Executable {
    @Override
    public void execute(Blockchain blockchain) {
        List<Block> blocks = blockchain.getBlockchain();

        int cnt = 0;
        for (Block block : blocks) {
            System.out.println("--------- BLOCK " + cnt + " ---------");
            System.out.println(block);
            System.out.println();

            cnt++;
        }
    }
}
