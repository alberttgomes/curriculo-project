import 'react-native-gesture-handler';

import React from 'react';

import { StyleSheet, View, SafeAreaView } from 'react-native';

import { Appearance } from 'react-native';

import { DefaultTheme } from 'react-native-paper';

import { NavigationContainer } from '@react-navigation/native';
import { createDrawerNavigator } from '@react-navigation/drawer';

import ExperiencesScreen from './pages/experiences';
import AboutScreem from './pages/about';
import AcademicScreen from './pages/academic';
import HomeScreen from './pages/home';
import Information from './pages/information';
import SkillsScreen from './pages/skills';


export const light = {
  ...DefaultTheme,
  roundness:2,
  colors:{
    ...DefaultTheme.colors,
    background: '#FFF',
    primary: '#131313',
    accent: '#9B0054',
    danger: '#Ed1c24'
  }
}

export const dark = {
  ...DefaultTheme,
  roundness:2,
  colors:{
    ...DefaultTheme.colors,
    background: '#131313',
    primary: '#FFF',
    accent: '#9B0054',
    danger: '#Ed1c24'
  }
}

const Drawer = createDrawerNavigator();

export default function App() {

  const colorScheme = Appearance.getColorScheme();
  console.log(colorScheme);

  return (
    <SafeAreaView style={styles.container}>

        <View theme={colorScheme === 'dark' ? dark : light}>
          
          <NavigationContainer>
           
            <Drawer.Navigator initialRouteName='Home'>
            
                <Drawer.Screen name='Home' component={HomeScreen} />
                <Drawer.Screen name='About' component={AboutScreem} />
                <Drawer.Screen name='Academic' component={AcademicScreen} />
                <Drawer.Screen name='Experiences' component={ExperiencesScreen} />
                <Drawer.Screen name='Information' component={Information} />
                <Drawer.Screen name='Skills' component={SkillsScreen} />
            
            </Drawer.Navigator>

          </NavigationContainer>

        </View>

    </SafeAreaView>
    
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});

