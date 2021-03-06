import React, { useState, useEffect } from 'react';

import { View, Text, ScrollView, StyleSheet, SafeAreaView } from 'react-native';

import { ExperiencesGet } from './request';

const ExperiencesScreen = () => {
    
    const [getExperiences, setGetExperiences] = useState([]);
    
    useEffect(() => {
        ExperiencesGet().then(res => {
            setGetExperiences(res.item)
        })
    }, []);
     
    return(
        <SafeAreaView style={styles.container}>
            <Text style={styles.text}>
                Experiencias
            </Text>
            <ScrollView>
                {getExperiences.map(getExperiences => (
                    <View key={getExperiences.id}>
                        <Text>Empresa: {getExperiences.jobs}</Text>
                        <Text>Atividades: {getExperiences.tracks}</Text>
                        <Text>Período: {getExperiences.time}</Text>
                    </View>
                ))}
            </ScrollView>
        </SafeAreaView>
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
})

export default ExperiencesScreen;