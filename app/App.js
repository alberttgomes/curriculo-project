import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, ScrollView } from 'react-native';

import { Appearance } from 'react-native';

import {useTheme} from 'react';

import Sidebar from './components/sidebar';


const light = {
  colors:{
    background: '#FFF',
    primary: '#131313',
    accent: '#9B0054',
    danger: '#Ed1c24'
  }
}

const dark = {
  colors:{
    background: '#131313',
    primary: '#FFF',
    accent: '#9B0054',
    danger: '#Ed1c24'
  }
}

const useTheme = useTheme(light, dark);

export default function App() {

  const colorScheme = Appearance.getColorScheme();

  return (
    <ScrollView style={styles.container}>
      <View useTheme={colorScheme === 'dark' ? dark : light}>
        <Sidebar />
        <StatusBar style="auto" />
      </View>
    </ScrollView>
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
