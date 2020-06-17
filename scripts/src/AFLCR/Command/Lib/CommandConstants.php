<?php

namespace AFLCR\Command\Lib;

class CommandConstants
{

    const VALID_EXPERIMENT_MODES = [
        'human-human'           => 'human-human',
        'botsing-human'         => 'botsing-human',
        'mult_botsing-human'    => 'mult_botsing-human',
        'botsing-evosuite'      => 'botsing-evosuite',
        'mult_botsing-evosuite' => 'mult_botsing-evosuite',
    ];

    const VALID_TEST_SUITE_MODES = [
        'botsing'          => 'botsing',
        'multiple-botsing' => 'multiple-botsing',
        'evosuite'         => 'evosuite',
        'defects4j'        => 'defects4j',
    ];
}