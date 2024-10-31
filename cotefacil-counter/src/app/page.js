'use client';
import { useState, useEffect } from 'react';
import styles from './page.module.css'; // Adjust the path if necessary

export default function Home() {
  const [counter, setCounter] = useState(0);

  // On init get's value from localstorage
  useEffect(() => {
    const saved = localStorage.getItem('counter');
    if (saved) {
      setCounter(parseInt(saved));
    }
  }, []);

  // Update localstorage on every change of state
  useEffect(() => {
    localStorage.setItem('counter', counter.toString());
  }, [counter]);

  const handleClick = (action) => {
    setCounter((prev) => (action === 'increase' ? prev + 1 : 0));
  };

  return (
    <div className={styles.background}>
      <main className={styles.main}>
        <span>
          <button className={styles.button} onClick={() => handleClick('increase')}>Increase</button>
          <button className={styles.button} onClick={() => handleClick('reset')}>Reset</button>
        </span>
        <div className={styles.counter}>{counter}</div>
      </main>
      <footer></footer>
    </div>
  );
}
