# Increment the player's permadeath count and send a global message regarding their demise
scoreboard players add @s permadeath 1
execute if score @s permadeath matches ..1 run tellraw @a {"translate":"power.rewovenblessings.one_life.deathOnce","with":[{"selector":"@s","color":"red"}],"color":"dark_red"}
execute if score @s permadeath matches 2.. run tellraw @a {"translate":"power.rewovenblessings.one_life.death","with":[{"selector":"@s","color":"red"},{"score":{"name":"@s","objective":"permadeath"},"color":"red"}],"color":"dark_red"}

# Clear Yigd Grave
execute if score @s permadeath matches 2.. run yigd restore
execute if score @s permadeath matches 2.. run clear


# Reset the player's inventories and other relevant stuff

# Clear inventory and experience
clear @s
kill @e[type=minecraft:experience_orb,limit=4,distance=..1]

# Clear ender chest
item modify entity @s enderchest.0 rewovenblessings:delete
item modify entity @s enderchest.1 rewovenblessings:delete
item modify entity @s enderchest.2 rewovenblessings:delete
item modify entity @s enderchest.3 rewovenblessings:delete
item modify entity @s enderchest.4 rewovenblessings:delete
item modify entity @s enderchest.5 rewovenblessings:delete
item modify entity @s enderchest.6 rewovenblessings:delete
item modify entity @s enderchest.7 rewovenblessings:delete
item modify entity @s enderchest.8 rewovenblessings:delete
item modify entity @s enderchest.9 rewovenblessings:delete
item modify entity @s enderchest.10 rewovenblessings:delete
item modify entity @s enderchest.11 rewovenblessings:delete
item modify entity @s enderchest.12 rewovenblessings:delete
item modify entity @s enderchest.13 rewovenblessings:delete
item modify entity @s enderchest.14 rewovenblessings:delete
item modify entity @s enderchest.15 rewovenblessings:delete
item modify entity @s enderchest.16 rewovenblessings:delete
item modify entity @s enderchest.17 rewovenblessings:delete
item modify entity @s enderchest.18 rewovenblessings:delete
item modify entity @s enderchest.19 rewovenblessings:delete
item modify entity @s enderchest.20 rewovenblessings:delete
item modify entity @s enderchest.21 rewovenblessings:delete
item modify entity @s enderchest.22 rewovenblessings:delete
item modify entity @s enderchest.23 rewovenblessings:delete
item modify entity @s enderchest.24 rewovenblessings:delete
item modify entity @s enderchest.25 rewovenblessings:delete
item modify entity @s enderchest.26 rewovenblessings:delete

# Reset advancements and recipes
advancement revoke @s everything
recipe take @s *