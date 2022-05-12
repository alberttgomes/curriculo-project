import React, { useEffect, useState } from "react";

import {View, Text, Button, StyleSheet} from 'react-native';

import { SkillsGet } from "./request";

const Skills = () => {
    
    const [getSkills, setGetSkills] = useState([]);

    useEffect(() => {
        SkillsGet().then(res => {
            setGetSkills(res.item);
        })
    }, []);
    
    return(
        <View style={styles.container}>
            <Text style={styles.text}>Habilidades</Text>
            <ScrollView>
                <View>
                    <Text>Soft Skills: </Text>
                        {getSkills.map(getSkills => (
                            <View key={getSkills.id}>
                                <Text>{getSkills.softSkill}</Text>
                            </View>
                        ))}
                </View>
                <View>
                    <Text>Hard Skills: </Text>
                        {getSkills.map(getSkills => (
                            <View>
                                <Text>{getSkills.hardSkills}</Text>
                            </View>
                        ))}
                </View>
            </ScrollView>
            <View>
                <Button
                    onPress={() => alert("Skills")}
                    title="Adicionar"
                />
            </View>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1
    },
    text: {
        fontSize: 25,
        fontWeight: 'bold'
    }
});

export default Skills;